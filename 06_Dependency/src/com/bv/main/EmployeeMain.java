package com.bv.main;

import com.bv.pojo.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		// Create employee object
		Employee employee = new Employee();
		// sysout employee
		System.out.println(employee);

		System.out.println("-------------------------------");

		// Using param constructor create employee
		Employee anotherEmployee = new Employee(1, "Vivek Gohil", 1000);
		System.out.println(anotherEmployee);

		System.out.println("-------------------------------");

		// Using Setter Methods
		employee.setEmployeeId(2);
		employee.setName("Ganesh Landge");
		employee.setSalary(1000);

		System.out.println(employee);

	}
}
