package main.com.banibis.backend.api;


import com.google.gson.Gson;
import main.com.banibis.backend.config.ConfigurationManager;
import main.com.banibis.backend.config.ConfigurationManagerImpl;
import main.com.banibis.backend.net.NetworkCommunicationService;
import main.com.banibis.backend.net.NetworkCommunicationServiceImpl;
import main.com.banibis.models.AllClient;
import main.com.banibis.models.AllDocuments;
import main.com.banibis.models.Document;
import main.com.banibis.models.Client;


public class BillduApiServiceImpl implements BillduApiService {
    // Config File
    private static ConfigurationManager config = new ConfigurationManagerImpl();
    // Network
    private NetworkCommunicationService net = new NetworkCommunicationServiceImpl();

    // Clients
    @Override
    public AllClient loadAllClients() {
        String url = config.getURL() + config.getParameterForClients() + "apiKey=" + config.getApiKey() + "&signature=" + config.getSignature() + "&amp;timestamp=" + config.getTimeStamp();
        String data = net.getResponseBodyByURL(url);
        return new Gson().fromJson(data, AllClient.class);
    }

    @Override
    public Client loadClient() {
        String url = config.getURL() + config.getParameterClient() + "apiKey=" + config.getApiKey() + "&signature=" + config.getSignature() + "&amp;timestamp=" + config.getTimeStamp();
        String data = net.getResponseBodyByURL(url);
        return new Gson().fromJson(data, Client.class);
    }

    // Documents
    @Override
    public AllDocuments loadAllDocument() {
        String url = config.getURL() + config.getParameterForDocuments() + "type=" + config.getParameterType() + "&apiKey=" + config.getApiKey() + "&signature=" + config.getSignature() + "&amp;timestamp=" + config.getTimeStamp();
        String data = net.getResponseBodyByURL(url);
        return new Gson().fromJson(data, AllDocuments.class);
    }

    @Override
    public Document loadDocument() {
        String url = config.getURL() + config.getParameterDocument() + "apiKey=" + config.getApiKey() + "&signature=" + config.getSignature() + "&amp;timestamp=" + config.getTimeStamp();
        String data = net.getResponseBodyByURL(url);
        return new Gson().fromJson(data, Document.class);
    }

}
