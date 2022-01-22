package com.bv.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bv.pojo.Employee;

public class EmployeeAddressMain {
	public static void main(String[] args) {
		// Inject Employee Object Using SpringContainer
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		Employee employee = applicationContext.getBean("employee", Employee.class);

		System.out.println(employee);
	}
}
