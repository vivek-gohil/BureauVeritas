package com.bv.pojo;

//Composition
//Every employee has a address.
public class Employee {
	private int employeeId;
	private String name;
	private double salary;
	private Address homeAddress;

	public Employee() {
		System.out.println("Employee Object Is Created And Default Constructor Called");
	}

	public Employee(int employeeId, String name, double salary, Address homeAddress) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.homeAddress = homeAddress;
		System.out.println("Employee Object Is Created And Overloaded Constructor Called");
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", homeAddress="
				+ homeAddress + "]";
	}

}
