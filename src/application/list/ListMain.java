package application.list;

import java.util.Scanner;

import services.ListService;

public class ListMain {

	public static void main(String[] args) {

		System.out.println("Type 3 task descriptions: ");

		try (Scanner input = new Scanner(System.in)) {
			 
			inputProcess(input);

		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}

	private static void inputProcess(Scanner input) {
		
		ListService service = new ListService();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Adding task...");
			String description = input.next();
			
			service.addTask(description);
		}
		
		System.out.println("\nTasks number: " + service.getNumberOfTasks());

		System.out.print("\nEnter task to remove: ");
		String description = input.next();
		
		System.out.println("Removing '" + description + "'");
		service.removeTask(description);

		System.out.println("\nTasks number: " + service.getNumberOfTasks());
	}

}
