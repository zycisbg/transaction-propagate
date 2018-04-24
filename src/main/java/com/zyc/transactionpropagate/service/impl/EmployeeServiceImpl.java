package com.zyc.transactionpropagate.service.impl;

import com.zyc.transactionpropagate.dao.EmployeeMapper;
import com.zyc.transactionpropagate.model.Employee;
import com.zyc.transactionpropagate.service.DepartmentService;
import com.zyc.transactionpropagate.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    DepartmentService departmentService;

    /**
     * 添加员工的同时添加部门
     * @param name 员工姓名
     */
    @Override
//    @Transactional(propagation = Propagation.REQUIRED)
    public void addEmpByRequired(String name) {
        Employee employee = new Employee();
        employee.setDeptId(1);
        employee.setName(name);
        employee.setAddress("邯郸");
        employeeMapper.insertSelective(employee);
        departmentService.addDeptByRequired("jishubu");
        int i = 1/0;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void addEmpBySupports(String name) {
        Employee employee = new Employee();
        employee.setDeptId(2);
        employee.setName(name);
        employee.setAddress("邯郸");
        employeeMapper.insertSelective(employee);
        departmentService.addDeptBySupports("jishubu");
        int i = 1/0;
    }

    @Override
//    @Transactional(propagation = Propagation.REQUIRED)
    public void addEmpByMandatory(String name) {
        System.out.println("aaaaaa");
        Employee employee = new Employee();
        employee.setDeptId(3);
        employee.setName(name);
        employee.setAddress("邯郸");
        employeeMapper.insertSelective(employee);
        departmentService.addDeptByMandatory("jishubu");
        int i = 1/0;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addEmpByRequiresNew(String name) {
        Employee employee = new Employee();
        employee.setDeptId(4);
        employee.setName(name);
        employee.setAddress("邯郸");
        employeeMapper.insertSelective(employee);
        departmentService.addDeptByRequiresNew("jishubu");
        int i = 1/0;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void addEmpByNotSupported(String name) {
        Employee employee = new Employee();
        employee.setDeptId(5);
        employee.setName(name);
        employee.setAddress("邯郸");
        employeeMapper.insertSelective(employee);
        departmentService.addDeptByNotSupported("jishubu");
        int i = 1/0;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void addEmpByNever(String name) {
        Employee employee = new Employee();
        employee.setDeptId(6);
        employee.setName(name);
        employee.setAddress("邯郸");
        employeeMapper.insertSelective(employee);
        departmentService.addDeptByNever("jishubu");
        int i = 1/0;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void addEmpByNested(String name) {
        Employee employee = new Employee();
        employee.setDeptId(7);
        employee.setName(name);
        employee.setAddress("邯郸");
        employeeMapper.insertSelective(employee);
        try {

            departmentService.addDeptByNested("jishubu");
        }catch (Exception e){

        }
//        int i = 1/0;
    }
}
