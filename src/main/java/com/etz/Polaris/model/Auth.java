package com.etz.Polaris.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Auth {
    private String type;
    private String secure;
    private String auth_provider;
    private String route_mode;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSecure() {
        return secure;
    }

    public void setSecure(String secure) {
        this.secure = secure;
    }

    public String getAuth_provider() {
        return auth_provider;
    }

    public void setAuth_provider(String auth_provider) {
        this.auth_provider = auth_provider;
    }

    public String getRoute_mode() {
        return route_mode;
    }

    public void setRoute_mode(String route_mode) {
        this.route_mode = route_mode;
    }

    @Override
    public String toString() {
        return "Auth{\n" +
                "    \"type\":" + type + ",\n" +
                "    \"secure\":" + secure + ",\n" +
                "    \"auth_provider\":" + auth_provider + ",\n" +
                "    \"route_mode\":" + route_mode + ",\n" +
                "}";
    }
}


