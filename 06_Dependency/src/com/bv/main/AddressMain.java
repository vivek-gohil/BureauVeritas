package com.bv.main;

import com.bv.pojo.Address;

public class AddressMain {
	public static void main(String[] args) {
		// Create a object of address class - do not set values
		Address address = new Address();
		// Sysout the address object
		System.out.println(address);

		System.out.println("-------------------------------");

		Address homeAddress = new Address(101, "Nisarga CHS", "M.B. Road", "Mumbai", "123456");
		System.out.println(homeAddress);

		System.out.println("-------------------------------");

		address.setAddressId(102);
		address.setBuildingName("Woodland CHS");
		address.setStreet("L.B.S. Road");
		address.setCity("Mumbai");
		address.setPin("654321");

		System.out.println(address);

	}
}
