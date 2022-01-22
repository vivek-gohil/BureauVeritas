package com.bv.main;

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
	}
}
