package com.bv.main;

import com.bv.pojo.Address;
import com.bv.pojo.Employee;

public class DependencyMain {
	public static void main(String[] args) {

//		Address address = new Address("B-1204,Nisarga CHS", "M.B. Road", "Mumbai", "123456");
//
//		System.out.println(address);
//
//		Employee employee = new Employee(101, "Vivek Gohil", 1000);
//
//		System.out.println(employee);

		// Every employee has a address.
		// 1. Using Constructors
		Address homeAddress = new Address("B-1204,Nisarga CHS", "M.B. Road", "Mumbai", "123456");

		Employee employee = new Employee(101, "Vivek Gohil", 1000, homeAddress);

		System.out.println(employee);

		System.out.println("---------------------------------------------");

		Employee anotherEmployee = new Employee(102, "Mohd Mubeen", 2000,
				new Address("New Woodland", "M.G. Road", "Mumbai", "876543"));

		System.out.println(anotherEmployee);

		System.out.println("Setting values using set method");
		// 2.Using Set Methods
		Address anotherNewAddress = new Address();
		anotherNewAddress.setBuidlingName("Rose CHS");
		anotherNewAddress.setStreet("A.B. Road");
		anotherNewAddress.setCity("Mumbai");
		anotherNewAddress.setPin("1112212");

		Employee anotherNewEmployee = new Employee();
		anotherNewEmployee.setEmployeeId(103);
		anotherNewEmployee.setName("Mark Fernandes");
		anotherNewEmployee.setSalary(2000);
		anotherNewEmployee.setHomeAddress(anotherNewAddress);

		System.out.println(anotherNewEmployee);
		
		//You should create the dependent object(Address) first then create the main object(Employee)
		
	}
}
