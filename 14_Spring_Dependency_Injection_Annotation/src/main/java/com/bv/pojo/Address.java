package com.bv.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Address {
	private int addressId;
	private String buildingName;
	private String street;
	private String city;
	private String pin;

	public Address() {
		System.out.println("Default Constructor Of Address");
	}

	public Address(int addressId, String buildingName, String street, String city, String pin) {
		super();
		this.addressId = addressId;
		this.buildingName = buildingName;
		this.street = street;
		this.city = city;
		this.pin = pin;
		System.out.println("Overloaded Constructor Of Address");
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		System.out.println("Setting addressId :: " + addressId);
		this.addressId = addressId;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		System.out.println("Setting buildingName :: " + buildingName);
		this.buildingName = buildingName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		System.out.println("Setting street :: " + street);
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("Setting city :: " + city);
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		System.out.println("Setting pin :: " + pin);
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", buildingName=" + buildingName + ", street=" + street + ", city="
				+ city + ", pin=" + pin + "]";
	}

}
