package com.anlea.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.anlea.springcloud.entities.Dept;

@Mapper
public interface DeptDao {

    public Dept findById(Long deptNo);

    public boolean addDept(Dept dept);

    public List<Dept> findAll();
}
