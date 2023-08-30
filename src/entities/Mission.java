package entities;

public class Mission {

	String description;
	boolean complete;

	public Mission(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	@Override
	public String toString() {
		return "Mission [ description = " + description + ", complete : " + complete + " ] ";
	}

}
