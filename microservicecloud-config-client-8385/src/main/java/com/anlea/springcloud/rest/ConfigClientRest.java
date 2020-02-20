package com.anlea.springcloud.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientRest {

/*    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.server-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;*/

    @Autowired
    private Environment env;
    
    @RequestMapping("config")
    public String getConfig() {
        String applicationName = env.getProperty("spring.application.name");
        String eurekaServers = env.getProperty("eureka.client.server-url.defaultZone");
        String port = env.getProperty("server.port");
        String rs = "applicationName: " + applicationName + "\t eurekaServers: " + eurekaServers + " \t port: " + port;
        System.out.println(rs);
        return rs;
    }
}
