package com.anlea.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anlea.springcloud.dao.DeptDao;
import com.anlea.springcloud.entities.Dept;
import com.anlea.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao dao;

    @Override
    public Dept findById(Long deptNo) {
        return dao.findById(deptNo);
    }

    @Override
    public boolean addDept(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public List<Dept> findAll() {
        return dao.findAll();
    }

}
