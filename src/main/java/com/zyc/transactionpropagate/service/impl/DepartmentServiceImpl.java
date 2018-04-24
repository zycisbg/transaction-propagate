package com.zyc.transactionpropagate.service.impl;

import com.zyc.transactionpropagate.dao.DepartmentMapper;
import com.zyc.transactionpropagate.model.Department;
import com.zyc.transactionpropagate.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void addDeptByRequired(String name) {
        Department department = new Department();
        department.setName(name);
        departmentMapper.insertSelective(department);
        int i = 1/0;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public void addDeptBySupports(String name) {
        Department department = new Department();
        department.setName(name);
        departmentMapper.insertSelective(department);
        int i = 1/0;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public void addDeptByMandatory(String name) {
        Department department = new Department();
        department.setName(name);
        departmentMapper.insertSelective(department);
        int i = 1/0;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addDeptByRequiresNew(String name) {
        Department department = new Department();
        department.setName(name);
        departmentMapper.insertSelective(department);
//        int i = 1/0;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void addDeptByNotSupported(String name) {
        Department department = new Department();
        department.setName(name);
        departmentMapper.insertSelective(department);
        int i = 1/0;
    }

    @Override
    @Transactional(propagation = Propagation.NEVER)
    public void addDeptByNever(String name) {
        Department department = new Department();
        department.setName(name);
        departmentMapper.insertSelective(department);
        int i = 1/0;
    }

    @Override
    @Transactional(propagation = Propagation.NESTED)
    public void addDeptByNested(String name) {
        Department department = new Department();
        department.setName(name);
        departmentMapper.insertSelective(department);
        int i = 1/0;
    }
}
