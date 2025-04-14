package com;

public class AddressBookSystem {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book program");
		// Create a object - contact
		Contact contact = new Contact(
				"Pooja",
				"N G",
				"Perdoor",
				"Udupi",
				"Karnataka",
				576453,
				736365352L,
				"poojahd662@gmail.com");

		// Display the contact
		System.out.println(contact);
	}
}
