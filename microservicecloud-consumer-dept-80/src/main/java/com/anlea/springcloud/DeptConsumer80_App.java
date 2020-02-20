package com.anlea.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.netflix.loadbalancer.RandomRule;

@SpringBootApplication
@EnableEurekaClient
// 自定义负载均衡规则,此类不能和componentscan包及子包下
@RibbonClient(name = "MICROSERVICECLOUD-DEPT", configuration = RandomRule.class)
public class DeptConsumer80_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class, args);
    }
}
