package com.etz.Polaris.service.impl;

import com.etz.Polaris.service.SignatureInterface;
import org.springframework.stereotype.Service;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class SignatureService implements SignatureInterface {


    @Override
    public String getSignature(String requestId, String clientSecret) {
        String algorithm = "MD5";
        String hashingString = requestId +";"+clientSecret;
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance(algorithm);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        md.update(hashingString.getBytes());
        byte[] digest = md.digest();
        String signature = DatatypeConverter.printHexBinary(digest).toUpperCase();
        return signature;
    }


}
