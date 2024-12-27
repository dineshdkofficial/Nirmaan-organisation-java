package day23;

public class Book2 {
	private int id;
	private String bookName;
	private String author;
	private double price;
	private int noOfCopies;
	public Book2() {
		
	}
	public Book2(int id, String bookName, String author, double price, int noOfCopies) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.noOfCopies = noOfCopies;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
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
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	@Override
	public String toString() {
		return "Book2 [id=" + id + ", bookName=" + bookName + ", author=" + author + ", price=" + price
				+ ", noOfCopies=" + noOfCopies + "]";
	}

}
