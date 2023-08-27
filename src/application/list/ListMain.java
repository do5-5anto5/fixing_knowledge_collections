package application.list;

import java.util.Scanner;

import services.ListService;

public class ListMain {

	public static void main(String[] args) {

		ListService service = new ListService();
		System.out.println("Type 3 task descriptions: ");

		try (Scanner input = new Scanner(System.in)) {		
			addTaskProcess(service, input);
			removeTaskProcess(service, input);
			service.getTasksDescription();
		} 
		catch (RuntimeException e) {
			e.printStackTrace();
		}
	}	
	
	private static void addTaskProcess(ListService service, Scanner input) {
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Adding task...");
			String description = input.next();
			
			service.addTask(description);
			service.getNumberOfTasks();

		}
	}
	
	private static void removeTaskProcess(ListService service, Scanner input) {
		System.out.print("\nEnter task to remove: ");
		String description = input.next();
		
		System.out.println("Removing '" + description + "'");
		service.removeTask(description);
		service.getNumberOfTasks();

	}

}
