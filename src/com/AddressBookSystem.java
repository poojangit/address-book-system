package com;

import java.util.Scanner;

public class AddressBookSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AddressBook addressBook = new AddressBook();
		System.out.println("Welcome to Address Book program");
		System.out.print("Enter First Name: ");
		String firstName = scanner.nextLine();

		System.out.print("Enter Last Name: ");
		String lastName = scanner.nextLine();

		System.out.print("Enter Address: ");
		String address = scanner.nextLine();

		System.out.print("Enter City: ");
		String city = scanner.nextLine();

		System.out.print("Enter State: ");
		String state = scanner.nextLine();

		System.out.print("Enter ZIP: ");
		int zip = scanner.nextInt();

		System.out.print("Enter Phone Number: ");
		long phoneNumber = scanner.nextLong();

		System.out.print("Enter Email: ");
		String email = scanner.nextLine();

		// Create ContactPerson object
		Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);

		// Add to AddressBook
		addressBook.addContact(newContact);
		System.out.println();
		System.out.println("\nContact added successfully! Here's your Address Book:");
		addressBook.displayContacts();

		scanner.close();
	}
}
