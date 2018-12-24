package com.mass.RentMeHome.model;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="owners")
public class Owner {
	
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private int cin;
	private String email;
	private int phoneNUmber;


	public Owner(String firstName, String lastName, int cin, String email, int phoneNUmber) {
		super();
		this.id = UUID.randomUUID().toString();
		this.firstName = firstName;
		this.lastName = lastName;
		this.cin = cin;
		this.email = email;
		this.phoneNUmber = phoneNUmber;
	}
	

	public Owner() {
		super();
	}

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
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


	public int getCin() {
		return cin;
	}


	public void setCin(int cin) {
		this.cin = cin;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getPhoneNUmber() {
		return phoneNUmber;
	}


	public void setPhoneNUmber(int phoneNUmber) {
		this.phoneNUmber = phoneNUmber;
	}
	
	
}
