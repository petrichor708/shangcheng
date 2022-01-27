package com.lala.xiguamall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.lala.xiguamall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class XiguamallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiguamallMemberApplication.class, args);
    }

}
