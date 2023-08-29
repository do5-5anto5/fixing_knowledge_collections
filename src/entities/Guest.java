package entities;

public class Guest {

	private String name;
	private String ticketCode;
	
	public Guest() {}

	public Guest(String name, String ticketCode) {
		this.name = name;
		this.ticketCode = ticketCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTicketCode() {
		return ticketCode;
	}

	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}

	@Override
	public String toString() {
		return " Guest [ name = " + name + ", ticketCode = " + ticketCode + " ] ";
	}		
	
	
}
