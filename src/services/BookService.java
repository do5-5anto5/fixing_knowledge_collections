package services;

import java.util.ArrayList;
import java.util.List;

import entities.Book;

public class BookService {

	private List<Book> booksList;

	public BookService() {
		booksList = new ArrayList<>();
	}

	public void addBook(String name, String author, int releaseYear) {
		booksList.add(new Book(name, author, releaseYear));
	}

	public List<Book> researchByAuthor(String author) {
		if (!booksList.isEmpty()) {
			List<Book> researchByAuthor = new ArrayList<>();
			for (Book book : booksList) {
				if (book.getAuthor().equalsIgnoreCase(author)) {
					researchByAuthor.add(book);
				}
			}
			return researchByAuthor;
		} else {
			throw new RuntimeException("Empty list.");
		}
	}

	public Book researchByTitle(String title) {
		if (!booksList.isEmpty()) {	
			Book book = new Book();
			for (Book b : booksList) {
				if (b.getTitle().equalsIgnoreCase(title)) {
					book = b;
					break;
				}
			}
			return book;
		} else {
			throw new RuntimeException("Empty List");
		}
	}

	public List<Book> researchByYearRange(int startYear, int endYear) {
		if (!booksList.isEmpty()) {
			List<Book> researchByYearRange = new ArrayList<>();
			for (Book book : booksList) {
				if (book.getReleaseYear() > startYear && book.getReleaseYear() < endYear) {
					researchByYearRange.add(book);
				}
			}
			return researchByYearRange;
		} else {
			throw new RuntimeException("Empty List.");
		}
	}
}
