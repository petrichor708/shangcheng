package com.lala.xiguamall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
//剔除mybatis-plus的自动配置
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class XiguamallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiguamallGatewayApplication.class, args);
    }

}
