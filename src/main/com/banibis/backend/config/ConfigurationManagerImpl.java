package main.com.banibis.backend.config;

import java.io.*;
import java.util.Properties;

public class ConfigurationManagerImpl implements ConfigurationManager {

    private static String getConfigPropertyValue(String propertyName) {
        Properties properties = new Properties();
        final File initialFile = new File("src/config/config.properties");
        try {
            InputStream inputStream = new DataInputStream(new FileInputStream(initialFile));
            properties.load(inputStream);
            return properties.getProperty(propertyName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }

        return "";
    }

    @Override
    public String getApiKey() {
        return getConfigPropertyValue("apiKey");
    }

    @Override
    public String getSignature() {
        return getConfigPropertyValue("signature");
    }

    @Override
    public String getTimeStamp() {
        return getConfigPropertyValue("timestamp");
    }

    @Override
    public String getURL() {
        return getConfigPropertyValue("link");
    }

    @Override
    public String getParameterForClients() {
        return getConfigPropertyValue("allClients");
    }

    @Override
    public String getParameterClient() {
        return getConfigPropertyValue("client");
    }

    @Override
    public String getParameterDocument() {
        return getConfigPropertyValue("document");
    }

    @Override
    public String getParameterForDocuments() {
        return getConfigPropertyValue("allDocuments");
    }

    @Override
    public String getParameterType() {
        return getConfigPropertyValue("type");
    }
}
