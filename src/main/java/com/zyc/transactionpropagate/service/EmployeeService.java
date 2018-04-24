package com.zyc.transactionpropagate.service;

public interface EmployeeService {

    void addEmpByRequired(String name);

    void addEmpBySupports(String name);

    void addEmpByMandatory(String name);

    void addEmpByRequiresNew(String name);

    void addEmpByNotSupported(String name);

    void addEmpByNever(String name);

    void addEmpByNested(String name);
}
