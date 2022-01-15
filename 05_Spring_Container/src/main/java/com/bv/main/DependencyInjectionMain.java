package com.bv.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bv.pojo.Address;
import com.bv.pojo.Employee;

public class DependencyInjectionMain {
	public static void main(String[] args) {

		System.out.println("Main Start");

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		System.out.println("Spring Container Is Created");

		Employee employee = applicationContext.getBean("employee", Employee.class);

		System.out.println("Employee Object Is Injected By SpringContainer");

		System.out.println(employee);

		System.out.println("Main End");

	}
}
