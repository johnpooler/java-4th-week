package com.qa.inputs;

public class Runner {

	public static void main(String[] args) {
		System.out.println("enter first name:");
		String firstName = Utils.input();
		
		System.out.println("enter surname:");
		String surname = Utils.input();
		
		System.out.println("Hello " + firstName + " " + surname);

	}

}
