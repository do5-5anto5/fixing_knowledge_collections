package entities;

public class Guest {

	private String name;
	private int ticketCode;
	
	public Guest() {}

	public Guest(String name, int ticketCode) {
		this.name = name;
		this.ticketCode = ticketCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTicketCode() {
		return ticketCode;
	}

	public void setTicketCode(int ticketCode) {
		this.ticketCode = ticketCode;
	}

	@Override
	public String toString() {
		return " Guest [ name = " + name + ", ticketCode = " + ticketCode + " ] ";
	}		
	
	
}
