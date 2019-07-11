package com.sx.createxml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class CreatexmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreatexmlApplication.class, args);
    }
    // TODO ojbc是否可用111
}
