package com.zyc.transactionpropagate.controller;

import com.zyc.transactionpropagate.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @ResponseBody
    @RequestMapping("/zyc/emp/{name}")
    public String addEmp(@PathVariable("name") String name){

        employeeService.addEmpByRequired(name);

        return "ok";
    }
}
