package com.etz.Polaris.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class ConfigService {

    private static final HashMap<String, String> configProperties = new HashMap<String, String>();

    static {

        Properties prop = new Properties();

        try {
            prop.load(new FileInputStream(new java.io.File("C:\\Users\\David.Adenuga\\Documents\\Etranzact\\Projects\\Polaris\\src\\main\\java\\config.properties")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        prop.forEach((Key, value) -> configProperties.put((String) Key, (String) value));
    }

    public String transactionURL = configProperties.get("transactionURL");

    public String queryURL = configProperties.get("queryURL");
    public String contentType = configProperties.get("content_type");
    public String token = configProperties.get("token");
    public String configQueryId = configProperties.get("queryId");
    public String configClientSecret = configProperties.get("clientSecret");
    public String configTransactionId = configProperties.get("transactionId");
}
