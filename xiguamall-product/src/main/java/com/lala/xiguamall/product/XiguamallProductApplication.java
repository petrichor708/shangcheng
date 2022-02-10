package com.lala.xiguamall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class XiguamallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiguamallProductApplication.class, args);
    }

}
