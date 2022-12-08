package main.com.banibis.backend.config;

public interface ConfigurationManager {

    String getApiKey();

    String getSignature();

    String getTimeStamp();

    String getURL();

    String getParameterForClients();

    String getParameterClient();

    String getParameterDocument();

    String getParameterForDocuments();

    String getParameterType();
}
