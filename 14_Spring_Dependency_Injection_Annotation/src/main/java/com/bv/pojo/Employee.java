package com.bv.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Every employee has a address
@Component
@Scope("prototype")
public class Employee {
	private int employeeId;
	private String name;
	private double salary;

	private Address homeAddress;

	public Employee() {
		System.out.println("Default Constructor Of Employee");
	}

	public Employee(int employeeId, String name, double salary, Address homeAddress) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.homeAddress = homeAddress;
		System.out.println("Overloaded Constructor Employee");
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		System.out.println("Setting employeeId :: " + employeeId);
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting name :: " + name);
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		System.out.println("Setting salary :: " + salary);
		this.salary = salary;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	@Autowired
	public void setHomeAddress(Address homeAddress) {
		System.out.println("Setting homeAddress :: " + homeAddress);
		this.homeAddress = homeAddress;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", homeAddress="
				+ homeAddress + "]";
	}

}
