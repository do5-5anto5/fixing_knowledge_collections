package application.list;

import java.util.Scanner;

import entities.Task;
import services.ListService;

public class ListMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type 3 task descriptions: ");	
		
		for (int i=0; i<3; i++) {
			System.out.println("Adding task...");			
			String taskInput = input.next();
			
			Task task = new Task(taskInput);		
			ListService.addTask(task);			
		}
		
		try {
			
		System.out.println("\nTasks number: ");
		System.out.println(ListService.getNumberOfTasks());		
				
		System.out.print("\nEnter position to remove task: ");
		String position = input.next();		
		System.out.println("Removing '" + ListService.getTaskDescription(Integer.parseInt(position)) + "'");
		ListService.removeTask(Integer.parseInt(position));
		
		System.out.println("\nTasks number: ");
		System.out.println(ListService.getNumberOfTasks());		

		}
		catch (RuntimeException e) {
			e.printStackTrace();
		}
		finally {
		input.close();
		}
	}
	
	

}
