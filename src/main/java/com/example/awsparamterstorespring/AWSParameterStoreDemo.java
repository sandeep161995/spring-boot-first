package com.example.awsparamterstorespring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AWSParameterStoreDemo implements CommandLineRunner {

    @Value("${myParameter}")
    private String myParameter;

    @Value("${management.endpoints.web.exposure.include}")
    private String endpoints;

    @Override
    public void run(String... args) {
        System.out.println("myParameter: " + myParameter);
        System.out.println("endpoints: " + endpoints);
    }
}

