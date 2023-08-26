package services;

import java.util.ArrayList;
import java.util.List;

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

}
