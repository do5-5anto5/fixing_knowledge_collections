package entities;

import java.util.Objects;

public class Student implements Comparable<Student>{

	String name;
	Long registration;
	double grade;

	public Student(String name, Long registration, double grade) {
		this.name = name;
		this.registration = registration;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getRegistration() {
		return registration;
	}

	public void setRegistration(Long registration) {
		this.registration = registration;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [ name = " + name + ", registration = " + registration + ", grade = " + grade + " ] ";
	}

	@Override
	public int compareTo(Student student) {
		return name.compareTo(student.getName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(registration);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(registration, other.registration);
	}
	
	


}
