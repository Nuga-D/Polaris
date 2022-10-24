package com.etz.Polaris.service;

import java.security.NoSuchAlgorithmException;

public interface SignatureInterface {

    public String getSignature(String requestId, String clientSecret);
}
