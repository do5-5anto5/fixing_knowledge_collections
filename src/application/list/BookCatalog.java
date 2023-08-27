package application.list;

import services.BookService;

public class BookCatalog {

	public static void main(String[] args) {
		
		BookService bookService = new BookService();
		
		//test addBook
		bookService.addBook("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
	    bookService.addBook("Java Guia do Programador", "Peter Jandl Junior", 2021);
	    bookService.addBook("Código Limpo", "Robert C. Martin", 2009);
	    bookService.addBook("O Codificador Limpo", "Robert C. Martin", 2012);
	    
	    // test researchByAuthor
	    System.out.println(bookService.researchByAuthor("Robert C. Martin"));
	    System.out.println(bookService.researchByAuthor("no author"));
	    
	    //test researchByTitle
	    System.out.println(bookService.researchByTitle("Java Guia do Programador"));
	    System.out.println(bookService.researchByTitle("no title"));
	    
	    //test researchByYearRange 
	    System.out.println(bookService.researchByYearRange(2010, 2022));
	    System.out.println(bookService.researchByYearRange(2025, 2030));
	}

}
