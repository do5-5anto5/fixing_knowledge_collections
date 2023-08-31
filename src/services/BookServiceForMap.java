package services;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import entities.BookForMap;

public class BookServiceForMap {

	Map<String, BookForMap> bookstore;

	public BookServiceForMap() {
		bookstore = new TreeMap<>();
	}

	public void addBook(String isbn, String title, String author, double price) {
		bookstore.put(isbn, new BookForMap(title, author, price));
	}

	public void removeBookPerTitle(String title) {
		if (!bookstore.isEmpty()) {
			Iterator<String> iterator = bookstore.keySet().iterator();
			while (iterator.hasNext()) {
				String key = iterator.next();
				BookForMap book = bookstore.get(key);
				if (book.getTitle().equalsIgnoreCase(title)) {
					iterator.remove();
				}
			}

			System.out.println("Successfull removed '" + title + "'");
		} else {
			System.out.println("empty list.");
		}
	}

	public void showBooksByPrice() {
		if (!bookstore.isEmpty()) {

			Comparator<String> comparator = new Comparator<String>() {
				@Override
				public int compare(String isbn1, String isbn2) {
					// compare prices of books
					return Double.compare(bookstore.get(isbn1).getPrice(), bookstore.get(isbn2).getPrice());
				}
			};
			Map<String, BookForMap> booksByName = new TreeMap<>(comparator);
			booksByName.putAll(bookstore);

			for (String key : booksByName.keySet()) {
				System.out.println(booksByName.get(key));
			}
		} else {
			System.out.println("empty list.");
		}
	}

}
