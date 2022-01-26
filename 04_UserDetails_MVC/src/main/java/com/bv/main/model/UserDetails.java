package com.bv.main.model;

import java.util.Arrays;

public class UserDetails {
	private String firstName;
	private String lastName;
	private String gender;
	private String[] languages;
	private String qualification;

	public UserDetails() {
		// TODO Auto-generated constructor stub
	}

	public UserDetails(String firstName, String lastName, String gender, String[] languages, String qualification) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.languages = languages;
		this.qualification = qualification;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "UserDetails [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", languages="
				+ Arrays.toString(languages) + ", qualification=" + qualification + "]";
	}

}
