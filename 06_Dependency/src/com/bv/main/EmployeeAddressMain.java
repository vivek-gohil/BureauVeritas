package com.bv.main;

import com.bv.pojo.Address;
import com.bv.pojo.Employee;

public class EmployeeAddressMain {
	public static void main(String[] args) {
		// Create employee object
		Employee employee = new Employee();
		// Sysout employee object
		System.out.println(employee);

		System.out.println("-------------------------");

		// Create employee object - pass the parameters by calling param. constrcutor
		Address address2 = new Address(1, "ABC Apartment", "A.B. Road", "Mumbai", "111112");
		Employee employee2 = new Employee(101, "Vivek Gohil", 2000, address2);
		// Sysout employee
		System.out.println(employee2);

		System.out.println("-------------------------");

		Address address = new Address();
		address.setAddressId(2);
		address.setBuildingName("Suprem Apartment");
		address.setStreet("L.B.S. Raod");
		address.setCity("Mumbai");
		address.setPin("123456");

		employee.setEmployeeId(102);
		employee.setName("Sudhanshu Chaubey");
		employee.setSalary(2000);
		employee.setHomeAddress(address);

		System.out.println(employee);
	}
}
