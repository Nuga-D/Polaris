package com.etz.Polaris.util;

import com.etz.Polaris.model.NameQuery;
import com.etz.Polaris.service.impl.ConfigService;
import com.etz.Polaris.service.impl.QueryService;
import com.etz.Polaris.service.impl.TransactionService;
import com.google.gson.Gson;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HttpUtil {

    private TransactionService transactionService = new TransactionService();

    private QueryService queryService = new QueryService();

    private ConfigService configService = new ConfigService();

    @PostMapping("/transact")
    public Object getTransactionResponse(@RequestBody NameQuery nameQuery){

        JSONObject requestBody = new JSONObject();
        requestBody.put("request_ref", nameQuery.getRequest_ref()).put("request_type", nameQuery.getRequest_type());
        requestBody.put("auth", nameQuery.getAuth()).put("transaction", nameQuery.getTransaction());

        Unirest.setTimeouts(0, 0);
        com.mashape.unirest.http.HttpResponse<JsonNode> response = null;

        try {
            response = Unirest.post(configService.transactionURL)
                    .header("Content-Type", configService.contentType)
                    .header("Authorization", "Bearer " + configService.token)
                    .header("Signature", transactionService.signature)
                    .body(requestBody)
                    .asJson();
        } catch (UnirestException e) {
            throw new RuntimeException(e);
        }


        return response.getBody().getObject().toString(2);

    }

    @PostMapping("/query")
    public Object getTransactionQuery(@RequestBody NameQuery nameQuery) {
        JSONObject queryBody;
        queryBody = new JSONObject();
        queryBody.put("request_ref", nameQuery.getRequest_ref()).put("request_type", nameQuery.getRequest_type());
        queryBody.put("auth", nameQuery.getAuth().getSecure()).put("auth", nameQuery.getAuth().getAuth_provider());
        queryBody.put("transaction", nameQuery.getTransaction().getTransaction_ref());

        Unirest.setTimeouts(0, 0);
        com.mashape.unirest.http.HttpResponse<JsonNode> response = null;
        try {
            response = Unirest.post(configService.queryURL)
                    .header("Content-Type", configService.contentType)
                    .header("Authorization", "Bearer " + configService.token)
                    .header("Signature", queryService.signature)
                    .body(queryBody)
                    .asJson();
        } catch (UnirestException e) {
            throw new RuntimeException(e);
        }

        return response.getBody().getObject().toString(2);
    }








}
