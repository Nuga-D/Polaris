package com.etz.Polaris.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Meta {
    private String a_key;
    private String b_key;

    public String getA_key() {
        return a_key;
    }

    public void setA_key(String a_key) {
        this.a_key = a_key;
    }

    public String getB_key() {
        return b_key;
    }

    public void setB_key(String b_key) {
        this.b_key = b_key;
    }

    @Override
    public String toString() {
        return "Meta{\n" +
                "    \"a_key\":" + a_key + ",\n" +
                "    \"b_key\":" + b_key + ",\n" +
                "}";
    }
}
