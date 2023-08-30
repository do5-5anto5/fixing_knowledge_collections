package services;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.Student;

public class StudentService {

	public Set<Student> students;

	public StudentService() {
		students = new HashSet<>();
	}

	public void addStutent(String name, Long registration, double grade) {
		students.add(new Student(name, registration, grade));
	}

	public void removeStudent(Long reg) {
		if (!students.isEmpty()) {
			Student studentToRemove = null;
			for (Student s : students) {
				if (s.getRegistration().equals(reg)) {
					studentToRemove = s;
					break;
				}
			}
			students.remove(studentToRemove);
			System.out.println("Remove registration " + reg + " complete.");
		} else {
			System.out.println("\nEmpty List.");
		}
	}

	public void showStudentsByName() {
		if (!students.isEmpty()) {
			Set<Student> studentsByName = new TreeSet<>(students);
			System.out.println("\nStudents by name: ");
			for (Student s : studentsByName) {
				System.out.println(s);
			}
		} else {
			System.out.println("\nEmpty List.");
		}
	}

	public void showStudentsByGrade() {
		if (!students.isEmpty()) {
			Set<Student> studentsByGrade = new TreeSet<>(new StudentComparatorService());
			System.out.println("\nStudents by grade: ");
			studentsByGrade.addAll(students);

			for (Student s : studentsByGrade) {
				System.out.println(s);
			}
		} else {
			System.out.println("\nEmpty List.");
		}
	}

	public void showStudents() {
		if (!students.isEmpty()) {
			System.out.println("\nAll students");
			for (Student s : students) {
				System.out.println(s);
			}
		} else {
			System.out.println("\nEmpty List.");
		}
	}

}
