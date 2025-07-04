package com.iamfly.bankapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BankApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankApiGatewayApplication.class, args);
    }

}
