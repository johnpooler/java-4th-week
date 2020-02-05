package com.qa.databases;

public class Customer {
	private Long id;
	private String firstName;
	private String surname;
	
	public Customer(Long id, String firstName, String surname) {
		this.id=id;
		this.firstName=firstName;
		this.surname=surname;
	}
	
	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
