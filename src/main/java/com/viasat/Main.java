package com.viasat;

import org.apache.druid.security.basic.authentication.validator.CredentialsValidator;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        String json = "{\"type\":\"ldap\",\"url\":\"\",\"bindUser\":\"\",\"bindPassword\":\"\",\"baseDn\":\"\",\"userSearch\":\"\",\"userAttribute\":\"\",\"credentialIterations\":\"\",\"credentialVerifyDuration\":\"\",\"credentialMaxDuration\":\"\",\"credentialCacheSize\":\"\"}";

        ObjectMapper mapper = new ObjectMapper();
        try {
            CredentialsValidator credentialsValidator = mapper
                    .readerFor(CredentialsValidator.class)
                    .readValue(json);
//            credentialsValidator.validateCredentials();
            System.out.println(credentialsValidator);
        }
        catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("Hello World!"); // Display the string.
    }
}
