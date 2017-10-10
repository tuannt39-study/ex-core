package test.bookstore;

import java.util.ArrayList;
import java.util.Comparator;

public class Book {
	private int ID;
	private String name;
	private long price;
	private long soldNumber;
	private ArrayList<Author> author;
	private Category category;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int iD, String name, long price, long soldNumber,
			ArrayList<Author> author, Category category) {
		super();
		ID = iD;
		this.name = name;
		this.price = price;
		this.soldNumber = soldNumber;
		this.author = author;
		this.category = category;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public long getSoldNumber() {
		return soldNumber;
	}
	public void setSoldNumber(long soldNumber) {
		this.soldNumber = soldNumber;
	}
	public ArrayList<Author> getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author.add(author);
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Book [ID=" + ID + ", name=" + name + ", price=" + price
				+ ", soldNumber=" + soldNumber + ", author=" + author
				+ ", category=" + category + "]";
	}
}
