package com.etz.Polaris.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.JsonElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class NameQuery {
    private String request_ref;
    private String request_type;
    private Auth auth;
    private Transaction transaction;

    public String getRequest_ref() {
        return request_ref;
    }

    public void setRequest_ref(String request_ref) {
        this.request_ref = request_ref;
    }

    public String getRequest_type() {
        return request_type;
    }

    public void setRequest_type(String request_type) {
        this.request_type = request_type;
    }

    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

//    @Override
//    public String toString() {
//        return "NameQuery{\n" +
//                "    \"request_ref\":" + request_ref + ",\n" +
//                "    \"request_type\":" + request_type + ",\n" +
//                "    \"auth\": \n" + auth + ",\n" +
//                "    \"transaction\": \n" + transaction + ",\n" +
//                "}";
//    }
}
