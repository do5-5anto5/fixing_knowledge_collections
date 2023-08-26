package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Task;

public class ListService {
	
	
	static List<Task> tasks = new ArrayList<>();
	
	public static void addTask (Task task) {
		tasks.add(task);
	}
	
	public static void removeTask (int position) {
		Task object = tasks.get(position);
		tasks.remove(object);
	}
	
	public static String getNumberOfTasks() {
		return String.format("%1d", tasks.size());
	}
	
	public static String getTaskDescription (int position) {
		
		Task object = tasks.get(position);		
		return object.getTaskDescription();
	}
	
	public static int validatePosition(String position, Scanner input) {
		
		int parsedPosition = Integer.parseInt(position);
		
		while (parsedPosition < 0 || parsedPosition >= tasks.size()) {
			System.out.println("Invalid position. Enter number betwenn 0 and "
					+ String.format("%1d", tasks.size()-1));
			parsedPosition = input.nextInt();
		}
		return parsedPosition;
	}

}
