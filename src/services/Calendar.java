package services;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import entities.Event;

public class Calendar {

	private Map<LocalDate, Event> calendar;

	public Calendar() {
		this.calendar = new HashMap<>();
	}

	public void addEvent(LocalDate date, String name, String attraction) {
		calendar.put(date, new Event(name, attraction));
	}

	public void printCalendar() {
		Map<LocalDate, Event> treeCalendar = new TreeMap<>(calendar);
		for (LocalDate key : treeCalendar.keySet()) {
			System.out.println(key + ", " + treeCalendar.get(key));
		}
	}

	public void getNextEvent() {

		if (!calendar.isEmpty()) {
			LocalDate actualDate = LocalDate.now();
			LocalDate nextDate = null;
			Event nextEvent = null;

			for (LocalDate eventDate : calendar.keySet()) {
				if (eventDate.isEqual(actualDate) || eventDate.isAfter(actualDate)) {
					nextDate = eventDate;
					nextEvent = calendar.get(nextDate);
					break;
				}
			}
			if (nextEvent != null) {
				System.out.println("\nNext Event: \n" + nextDate + " " + calendar.get(nextDate));
			} else {
				System.out.println("there are no upcoming events");
			}
		} else {
			System.out.println("Empty calendar.");
		}
	}
}
