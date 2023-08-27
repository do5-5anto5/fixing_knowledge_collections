package services;

import java.util.Comparator;

import entities.Person;

public class PersonComparatorService implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		return Double.compare(p1.getHeight(), p2.getHeight());
	}
}
