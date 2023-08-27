package application.list;

import java.util.Locale;

import services.PersonService;

public class PeopleSort {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		PersonService personService = new PersonService();

		//adding people
		personService.addPerson("Alice", 20, 1.56);
		personService.addPerson("Bob", 30, 1.80);
		personService.addPerson("Charlie", 25, 1.70);
		personService.addPerson("David", 17, 1.56);

		//showing added people
		personService.printPeopleList();
		
		System.out.println();
		System.out.println("\nsort by age");
		personService.printSortedList(personService.peopleByAge());

		System.out.println();
		System.out.println("\nsort by height");
		personService.printSortedList(personService.peopleByHeight());
	}

}
