package main.com.banibis.backend.api;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import main.com.banibis.backend.config.ConfigurationManager;
import main.com.banibis.backend.config.ConfigurationManagerImpl;
import main.com.banibis.backend.net.NetworkCommunicationService;
import main.com.banibis.backend.net.NetworkCommunicationServiceImpl;
import main.com.banibis.models.AllClient;
import main.com.banibis.models.AllDocuments;
import main.com.banibis.models.Document;
import main.com.banibis.models.client.Client;
import main.com.banibis.models.client.Human;
import main.gson.RuntimeTypeAdapterFactory;


public class BillduApiServiceImpl implements BillduApiService {
    // Config File
    private static ConfigurationManager config = new ConfigurationManagerImpl();
    // Network
    private NetworkCommunicationService net = new NetworkCommunicationServiceImpl();


    @Override
    public Client loadClient(){
        String url = config.getURL()+config.getParameterClient()+"apiKey="+config.getApiKey()+"&signature="+config.getSignature()+"&amp;timestamp="+config.getTimeStamp();
        String data = net.getResponseBodyByURL(url);

        RuntimeTypeAdapterFactory<Human> humanAdapterFactory = RuntimeTypeAdapterFactory.of(Human.class, "type").registerSubtype(Client.class, Client.class.getName());

        Gson gson = new GsonBuilder()
                .registerTypeAdapterFactory(humanAdapterFactory)
                .create();
        return gson.fromJson(data, Client.class);
    }

    @Override
    public AllClient loadAllClients(){
        String url = config.getURL()+config.getParameterForClients()+"apiKey="+config.getApiKey()+"&signature="+config.getSignature()+"&amp;timestamp="+config.getTimeStamp();
        String data = net.getResponseBodyByURL(url);
        return new Gson().fromJson(data, AllClient.class);
    }

    @Override
    public AllDocuments loadAllDocument(){
        String url = config.getURL()+config.getParameterForDocuments()+"type="+config.getParameterType()+"&apiKey="+config.getApiKey()+"&signature="+config.getSignature()+"&amp;timestamp="+config.getTimeStamp();
        String data = net.getResponseBodyByURL(url);
        return new Gson().fromJson(data, AllDocuments.class);
    }

    @Override
    public Document loadDocument(){
        String url = config.getURL()+config.getParameterDocument()+"apiKey="+config.getApiKey()+"&signature="+config.getSignature()+"&amp;timestamp="+config.getTimeStamp();
        String data = net.getResponseBodyByURL(url);
        return new Gson().fromJson(data, Document.class);
    }

}
