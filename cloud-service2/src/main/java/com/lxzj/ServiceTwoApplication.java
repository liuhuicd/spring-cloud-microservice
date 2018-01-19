package com.lxzj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceTwoApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ServiceTwoApplication.class, args);
    }
}
