package com.anlea.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced //spring cloud ribbon负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    
    /**
     * 变更负载均衡规则
     * @return
     */
//    @Bean
//    public IRule myRule() {
//        return new RandomRule();
//    }
}
