package com.etz.Polaris.service.impl;


public class TransactionService {

    private ConfigService configService = new ConfigService();

    private String requestId = configService.configTransactionId;
    private String clientSecret = configService.configClientSecret;

    private SignatureService signatureService = new SignatureService();

    public String signature = signatureService.getSignature(requestId,  clientSecret);


}
