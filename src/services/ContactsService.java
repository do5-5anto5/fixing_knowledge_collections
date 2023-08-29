package services;

import java.util.HashSet;
import java.util.Set;

import entities.Contact;

public class ContactsService {

	Set<Contact> contactsSet;

	public ContactsService() {
		contactsSet = new HashSet<>();
	}

	public void addContact(String name, int number) {
		Contact contact = new Contact(name, number);
		contactsSet.add(contact);
	}

	public void showContacts() {
		if (!contactsSet.isEmpty()) {
			for (Contact contact : contactsSet) {
				System.out.println(contact);
			}
		} else {
			System.out.println("Empty List.");
		}
	}

	public void researchByName(String name) {
		if (!contactsSet.isEmpty()) {
			Set<Contact> contactsByName = new HashSet<>();
			for (Contact contact : contactsSet) {
				if (contact.getName().equalsIgnoreCase(name)) {
					contactsByName.add(contact);
				}
			}
			System.out.println("Contacts by name: '" + name +"'");
			for (Contact contact : contactsByName) {
				System.out.println(contact);
			}
		} else {
			System.out.println("Empty List.");
		}
	}

	public void updateContactNumber(String name, int newNumber) {
		if (!contactsSet.isEmpty()) {
			Contact contactToUpdateNumber = null;
			for (Contact contact : contactsSet) {
				if (contact.getName().equalsIgnoreCase(name)) {
					contactToUpdateNumber = contact;
					break;
				}
			}
			contactToUpdateNumber.setNumber(newNumber);
			System.out.println("Contact " + contactToUpdateNumber.getName() + "'s number updated to: "
					+ contactToUpdateNumber.getNumber());
		} else {
			System.out.println("Empty List.");
		}
	}
}
