package com.anlea.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anlea.springcloud.entities.Dept;
import com.anlea.springcloud.service.DeptService;

@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    @RequestMapping(value = "/dept/get/{deptNo}", method = RequestMethod.GET)
    public Dept get(@PathVariable("deptNo") Long deptNo) {
        return service.findById(deptNo);
    }

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return service.addDept(dept);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> findAll() {
        return service.findAll();
    }

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery() {
        List<String> list = client.getServices();
        System.out.println("***********" + list);
        List<ServiceInstance> srvlist = client.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance serviceInstance : srvlist) {
            System.out.println(serviceInstance.getServiceId() + "\t" + serviceInstance.getHost() + "\t"
                    + serviceInstance.getUri());
        }
        return client;
    }
}
