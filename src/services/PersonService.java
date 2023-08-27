package services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Person;

public class PersonService {
	
	private List<Person> peopleList;
	
	public PersonService () {
		peopleList = new ArrayList<>();
	}
	
	public void addPerson(String name, int age, double height) {
		peopleList.add(new Person(name, age, height));
	}

	public List<Person> peopleByAge(){
		
		if (!peopleList.isEmpty()) {
		List<Person> peopleByAge = new ArrayList<>(peopleList);
		
		Collections.sort(peopleByAge);
		
		return peopleByAge;
		}
		else {
			throw new RuntimeException("EmptyList");
		}
	}
	
	public List<Person> peopleByHeight(){
		
		if (!peopleList.isEmpty()) {
		List<Person> peopleByHeight = new ArrayList<>(peopleList);		
		Collections.sort(peopleByHeight, new PersonComparatorService());		
		return peopleByHeight;
		}
		else {
			throw new RuntimeException ("Empty List");		
		}
	}
	
	public void printPeopleList() {
		for (Person p : peopleList) {
			System.out.println(p);
		}
	}
	
	public void printSortedList(List<Person>list) {
		for (Person p : list) {
			System.out.println(p);
		}
	}
}
