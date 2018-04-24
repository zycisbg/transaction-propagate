package com.zyc.transactionpropagate.service;

public interface DepartmentService {

    void addDeptByRequired(String name);

    void addDeptBySupports(String name);

    void addDeptByMandatory(String name);

    void addDeptByRequiresNew(String name);

    void addDeptByNotSupported(String name);

    void addDeptByNever(String name);

    void addDeptByNested(String name);
}
