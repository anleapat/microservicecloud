package com.anlea.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anlea.springcloud.entities.Dept;
import com.anlea.springcloud.service.DeptClientService;

@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientService service;

    @RequestMapping(value = "/consumer/dept/get/{deptNo}", method = RequestMethod.GET)
    public Dept get(@PathVariable("deptNo") Long deptNo) {
        return service.get(deptNo);
    }

    @RequestMapping(value = "/consumer/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @RequestMapping(value = "/consumer/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return service.list();
    }

}
