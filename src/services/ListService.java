package services;

import java.util.ArrayList;
import java.util.List;

import entities.Task;

public class ListService {

	private List<Task> tasksList;

	public ListService() {
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

	public int getNumberOfTasks() {
		return tasksList.size();
	}

	public void getTasksDescription() {
		System.out.println(tasksList);
	}	

}


