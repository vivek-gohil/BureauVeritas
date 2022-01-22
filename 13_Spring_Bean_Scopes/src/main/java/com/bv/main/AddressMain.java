package com.bv.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bv.pojo.Address;

public class AddressMain {
	public static void main(String[] args) {
		// Need Address Object - don't create the object , inject it

		// SpringContainer , SpringFactory
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		Address address = applicationContext.getBean("address", Address.class);

		System.out.println(address);

		System.out.println("---------------------------------");

		// Accept the address details from user and set to the address object
		int addressId;
		String buidlingName;
		String street;
		String city;
		String pin;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter AddressId");
		addressId = scanner.nextInt();
		System.out.println("Enter building name");
		scanner.nextLine();
		buidlingName = scanner.nextLine();
		scanner.nextLine();
		System.out.println("Enter street");
		street = scanner.nextLine();
		scanner.nextLine();
		System.out.println("Enter city");
		city = scanner.next();
		scanner.nextLine();
		System.out.println("Enter Pin");
		pin = scanner.nextLine();

		address.setAddressId(addressId);
		address.setBuildingName(buidlingName);
		address.setStreet(street);
		address.setCity(city);
		address.setPin(pin);

		System.out.println(address);

		System.out.println("----------------------------------");
		Address address2 = applicationContext.getBean("address", Address.class);
		System.out.println(address2);
	}
}
