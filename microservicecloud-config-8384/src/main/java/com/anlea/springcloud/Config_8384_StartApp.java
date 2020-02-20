package com.anlea.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Config_8384_StartApp {

    public static void main(String[] args) {
        SpringApplication.run(Config_8384_StartApp.class, args);
    }
}
