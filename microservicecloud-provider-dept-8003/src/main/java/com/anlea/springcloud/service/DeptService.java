package com.anlea.springcloud.service;

import java.util.List;

import com.anlea.springcloud.entities.Dept;

public interface DeptService {

    public Dept findById(Long deptNo);

    public boolean addDept(Dept dept);

    public List<Dept> findAll();
}
