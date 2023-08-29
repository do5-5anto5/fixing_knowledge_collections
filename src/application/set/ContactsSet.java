package application.set;

import services.ContactsService;

public class ContactsSet {

	public static void main(String[] args) {
		
		ContactsService service = new ContactsService();

		service.addContact("Joao", 1111);
		service.addContact("Maria", 2222);
		service.addContact("Pedro", 3333);
		service.addContact("Andrea", 4444);
		
		service.showContacts();
		
		service.researchByName("Pedro");
		
		service.updateContactNumber("Andrea", 55555);
		
	
	}
}