package day25;

import java.util.Objects;

public class SetInJava implements Comparable<SetInJava>{
	private int Id;
	private String bookName;
	private String author;
	private double price;
	private int noOfCopies;
	public SetInJava() {
		super();
	}
	public SetInJava(int id, String bookName, String author, double price, int noOfCopies) {
		super();
		Id = id;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.noOfCopies = noOfCopies;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Id, author, bookName, noOfCopies, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SetInJava other = (SetInJava) obj;
		return Id == other.Id && Objects.equals(author, other.author) && Objects.equals(bookName, other.bookName)
				&& noOfCopies == other.noOfCopies
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	@Override
	public int compareTo(SetInJava other) {
		// TODO Auto-generated method stub
		return Integer.compare(this.Id,other.Id);
	}
}
	
	
	