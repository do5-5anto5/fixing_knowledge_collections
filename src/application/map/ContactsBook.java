package application.map;

import java.util.HashMap;
import java.util.Map;

public class ContactsBook {
	private Map<String, Integer> contactsBook;		
	
	public ContactsBook () {
		contactsBook = new HashMap<>();
	}

	public void addContact(String name, Integer number) {
		contactsBook.put(name, number);
	}
	
	public void removeContact(String name) {
		if (!contactsBook.isEmpty()) {
			contactsBook.remove(name);
			System.out.println(name + " removed from book."); 
		}
		else {
			System.out.println("Empty List.");
		}
	}
	
	public void researchContactByName(String name) {
		if (!contactsBook.isEmpty()) {
			System.out.println(name + ", " + contactsBook.get(name));
		}
		else {
			System.out.println("Empty List.");
		}
	}
	
	public static void main (String[] args) {
		
		ContactsBook book = new ContactsBook();
		
		book.addContact("Maria", 1111);
		book.addContact("Joao", 2222);
		book.addContact("Jose", 3333);
		book.addContact("Paula", 4444);
		book.addContact("Antonia", 5555);
		book.addContact("Paula", 4444);
		
		book.researchContactByName("Paula");
		book.removeContact("Jose");		
	}
}
