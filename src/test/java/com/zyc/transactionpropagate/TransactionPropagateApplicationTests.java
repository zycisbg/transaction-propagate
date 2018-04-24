package com.zyc.transactionpropagate;

import com.zyc.transactionpropagate.service.DepartmentService;
import com.zyc.transactionpropagate.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransactionPropagateApplicationTests {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private DepartmentService departmentService;

	@Test
	public void contextLoads() {
		employeeService.addEmpByRequired("laoda");
	}

	@Test
	public void test0() {
		employeeService.addEmpBySupports("laoer");
	}

	@Test
	public void test1() {
		employeeService.addEmpByMandatory("laosan");
	}

	@Test
	public void test2() {
		employeeService.addEmpByRequiresNew("laosi");
	}

	@Test
	public void test3() {
		employeeService.addEmpByNotSupported("laowu");
	}

	@Test
	public void test4() {
		employeeService.addEmpByNever("laoliu");
	}

	@Test
	public void test5() {
		employeeService.addEmpByNested("laoqi");
	}
}
