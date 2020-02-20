package com.anlea.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Config_Git_Eureka_7001_StartApp {

    public static void main(String[] args) {
        SpringApplication.run(Config_Git_Eureka_7001_StartApp.class, args);
    }
}
