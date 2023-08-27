package application.list;

import java.util.Scanner;

import services.TaskService;

public class TasksClient {

	public static void main(String[] args) {

		TaskService taskService = new TaskService();
		System.out.println("Type 3 task descriptions: ");

		try (Scanner input = new Scanner(System.in)) {		
			addTaskProcess(taskService, input);
			removeTaskProcess(taskService, input);
			taskService.getTasksDescription();
		} 
		catch (RuntimeException e) {
			e.printStackTrace();
		}
	}	
	
	private static void addTaskProcess(TaskService service, Scanner input) {
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Adding task...");
			String description = input.next();
			
			service.addTask(description);
			service.getNumberOfTasks();

		}
	}
	
	private static void removeTaskProcess(TaskService service, Scanner input) {
		System.out.print("\nEnter task to remove: ");
		String description = input.next();
		
		System.out.println("Removing '" + description + "'");
		service.removeTask(description);
		service.getNumberOfTasks();

	}

}
