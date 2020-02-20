package com.anlea.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.anlea.springcloud.entities.Dept;

import feign.hystrix.FallbackFactory;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable arg0) {
        return new DeptClientService() {

            @Override
            public Dept get(Long deptNo) {
                Dept dept = new Dept();
                dept.setDeptNo(deptNo);
                dept.setDname("数据不存在");
                return dept;
            }

            @Override
            public List<Dept> list() {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                // TODO Auto-generated method stub
                return false;
            }

        };
    }

}
