package application.map;

import java.time.LocalDate;
import java.time.Month;

import services.Calendar;

public class EventsCalendar {

	public static void main(String[] args) {
		
		Calendar calendar = new Calendar();

	    calendar.addEvent(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
	    calendar.addEvent(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
	    calendar.addEvent(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
	    calendar.addEvent(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
	    calendar.addEvent(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

	    calendar.printCalendar();
	    
	    calendar.getNextEvent();
	}

}
