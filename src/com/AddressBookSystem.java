package com;

public class AddressBookSystem {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book program");
		// Create a new contact object
		Contact contact = new Contact("Pooja", "N G", "Perdoor", "Udupi", "Karnataka", 576124, 7899340021L,
				"poojang241@gmail.com");
		// printing contact details
		System.out.println(contact);
	}
}
