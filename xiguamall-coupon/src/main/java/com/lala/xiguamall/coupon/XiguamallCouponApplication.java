package com.lala.xiguamall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class XiguamallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiguamallCouponApplication.class, args);
    }

}
