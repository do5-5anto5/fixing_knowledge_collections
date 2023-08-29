package application.set;

import services.GuestService;

public class GuestsSet {

	public static void main(String[] args) {
		
		GuestService guestService = new GuestService();

		guestService.addGuest("Joao", "bobo");
		guestService.addGuest("Maria", "boba");	
		
		guestService.removeGuest("bobo");
		guestService.guestsCount();
		guestService.showGuests();


	}

}
