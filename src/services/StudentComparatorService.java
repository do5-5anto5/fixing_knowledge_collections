package services;

import java.util.Comparator;

import entities.Student;

public class StudentComparatorService implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return Double.compare(student1.getGrade(), student2.getGrade());
	}

}
