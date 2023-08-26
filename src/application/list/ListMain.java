package application.list;

import java.util.Scanner;

import entities.Task;
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
		for (int i = 0; i < 3; i++) {
			System.out.println("Adding task...");
			String taskInput = input.next();

			Task task = new Task(taskInput);
			ListService.addTask(task);
		}
		
		System.out.println("\nTasks number: ");
		System.out.println(ListService.getNumberOfTasks());

		System.out.print("\nEnter position to remove task: ");
		String positionInput = input.next();
		
		int position = ListService.validatePosition(positionInput, input);
		
		System.out.println("Removing '" + ListService.getTaskDescription(position) + "'");
		ListService.removeTask(position);

		System.out.println("\nTasks number: ");
		System.out.println(ListService.getNumberOfTasks());
	}

}
