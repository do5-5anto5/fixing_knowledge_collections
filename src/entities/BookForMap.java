package entities;

public class BookForMap implements Comparable<BookForMap> {
	
	private String title;
	private String author;
	private double price;
	
	public BookForMap(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookForMap [ title = " + title + ", author = " + author + ", price = " + price + " ] ";
	}

	
	@Override
	public int compareTo(BookForMap book) {
		return Double.compare(price, book.getPrice());
	}
	
}
