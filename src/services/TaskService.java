package services;

import java.util.ArrayList;
import java.util.List;

import entities.Task;

public class TaskService {

	private List<Task> tasksList;

	public TaskService() {
		this.tasksList = new ArrayList<>();
	}

	public void addTask(String description) {
		tasksList.add(new Task(description));
	}

	public void removeTask(String description) {
		List<Task> tasksToRemove = new ArrayList<>();
		for (Task task : tasksList) {
			if (task.getTaskDescription().equalsIgnoreCase(description)) {
				tasksToRemove.add(task);
			}
		}
		tasksList.removeAll(tasksToRemove);
	}

	public void getNumberOfTasks() {
		System.out.println("Total of tasks is now: " + tasksList.size());
	}

	public void getTasksDescription() {
		System.out.println("\n" + tasksList.toString());
	}	

}


