package com.etz.Polaris.service.impl;


public class QueryService {

   private ConfigService configService = new ConfigService();

    private String requestId = configService.configQueryId;
    private String clientSecret = configService.configClientSecret;

    private SignatureService signatureService = new SignatureService();

    public String signature = signatureService.getSignature(requestId,  clientSecret);
}
