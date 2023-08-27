package entities;

public class Task {
	
	String taskDescription;
	
	public Task (String taskDescription) {
		this.taskDescription = taskDescription;
	}
	
	public String getTaskDescription(){
		return taskDescription;
	}
	
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	@Override
	public String toString() {
		return "Tarefa: " + taskDescription;
	}
	
}
