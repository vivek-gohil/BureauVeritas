package com.bv.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bv.pojo.Address;

public class InjectionMain {
	public static void main(String[] args) {
		// Injecting Object of Address from SpringContainer

		// 1. Create SpringContainer
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		// 2. Inject the Address object
		Address homeAddress = applicationContext.getBean("homeAddress", Address.class);

		System.out.println(homeAddress);
		homeAddress.setBuidlingName("MyBuidling");
		homeAddress.setStreet("M.B. Road");
		homeAddress.setCity("Mumbai");
		homeAddress.setPin("123456");
		System.out.println(homeAddress);

	}
}
