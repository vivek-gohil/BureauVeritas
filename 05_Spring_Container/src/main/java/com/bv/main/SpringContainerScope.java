package com.bv.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bv.pojo.Address;
import com.bv.pojo.Employee;

public class SpringContainerScope {
	public static void main(String[] args) {
		System.out.println("Main Start");

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		System.out.println("SpringContainer is created!");

		Object object = applicationContext.getBean("employee");

		//print the employee toString bcos the object is act pointing to employee class
		System.out.println(object);
		

		System.out.println("--------------------------");

		//Employee employee2 = applicationContext.getBean("employee", Employee.class);

		System.out.println("Main End");
//		Employee employee = applicationContext.getBean("employee", Employee.class);
//		System.out.println(employee);
//
//		System.out.println();
//
//		employee.setEmployeeId(101);
//		employee.setName("test");
//		employee.setSalary(1000);
//
//		System.out.println(employee);
//
//		System.out.println();
//
//		Address address = employee.getHomeAddress();
//		address.setBuidlingName("test building");
//		address.setStreet("test street");
//		address.setCity("test city");
//		address.setPin("testpin");
//
//		System.out.println(employee);
//
//		System.out.println("Creating new employee");
//
//		Employee employee2 = applicationContext.getBean("employee", Employee.class);
//
//		System.out.println(employee2);
//		employee2.setName("updated name");
//
//		System.out.println();
//
//		System.out.println("employee");
//		System.out.println(employee);
//
//		System.out.println();
//
//		System.out.println("employee2");
//		System.out.println(employee2);

	}
}
