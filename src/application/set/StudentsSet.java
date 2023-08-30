package application.set;

import java.util.Locale;

import services.StudentService;

public class StudentsSet {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		
		StudentService service = new StudentService();
		
		service.addStutent("João", 1111L, 10.0);
		service.addStutent("Maria", 2222L, 10.0);
		service.addStutent("Pedro", 3333L, 10.0);
		service.addStutent("Andrea", 4444L, 10.0);
		
		service.removeStudent(1111L);
		
		service.showStudentsByName();
		service.showStudentsByGrade();
		service.showStudents();
		
	
	}

}
