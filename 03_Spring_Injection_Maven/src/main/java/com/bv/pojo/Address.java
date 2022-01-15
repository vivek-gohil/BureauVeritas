package com.bv.pojo;

public class Address {
	private String buidlingName;
	private String street;
	private String city;
	private String pin;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String buidlingName, String street, String city, String pin) {
		super();
		this.buidlingName = buidlingName;
		this.street = street;
		this.city = city;
		this.pin = pin;
	}

	public String getBuidlingName() {
		return buidlingName;
	}

	public void setBuidlingName(String buidlingName) {
		this.buidlingName = buidlingName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [buidlingName=" + buidlingName + ", street=" + street + ", city=" + city + ", pin=" + pin + "]";
	}

}
