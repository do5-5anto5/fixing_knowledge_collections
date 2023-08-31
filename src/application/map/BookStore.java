package application.map;

import services.BookServiceForMap;

public class BookStore {

	public static void main(String[] args) {
		
		BookServiceForMap service = new BookServiceForMap();
		
		service.addBook("https://amzn.to/3EclT8Z", "1984", "George Orwell", 50d);
	    service.addBook("https://amzn.to/47Umiun", "A Revolução dos Bichos", "George Orwell", 7.05d);
	    service.addBook("https://amzn.to/3L1FFI6", "Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d);
	    service.addBook("https://amzn.to/3OYb9jk", "Malorie", "Josh Malerman", 5d);
	    service.addBook("https://amzn.to/45HQE1L", "E Não Sobrou Nenhum", "Agatha Christie", 50d);
	    service.addBook("https://amzn.to/45u86q4", "Assassinato no Expresso do Oriente", "Agatha Christie", 5d);
	
	    service.removeBookPerTitle("E Não Sobrou Nenhum");
	    service.showBooksByPrice();
	}

}
