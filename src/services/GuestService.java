package services;

import java.util.HashSet;
import java.util.Set;

import entities.Guest;

public class GuestService {

    private Set<Guest> guests;

    public GuestService(){
        this.guests = new HashSet<>();
    }
    
    public void addGuest(String name, String ticketCode){
        guests.add(new Guest(name, ticketCode));
    }

    public void removeGuest(String ticketCode){
        Guest guestToBeRemoved = null;
        for (Guest guest : guests){
            if (guest.getTicketCode().equalsIgnoreCase(ticketCode)){
                guestToBeRemoved = guest;
            }
        }
        guests.remove(guestToBeRemoved);
    }

    public void guestsCount (){
        System.out.println("Total of guests: " + guests.size());
    }

    public void showGuests(){
        for (Guest guest: guests){
            System.out.println(guest);
        }
    }
}
