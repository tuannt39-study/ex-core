package test.bookstore;

import java.util.Comparator;

public class Author {
	private int ID;
	private String name;
	private int age;
	private long sold;
	private long revenue;
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Author(int iD, String name, int age, long sold) {
		super();
		ID = iD;
		this.name = name;
		this.age = age;
		this.sold = sold;
	}

	public Author(int iD, String name, int age, long sold,long revenue) {
		super();
		ID = iD;
		this.name = name;
		this.age = age;
		this.sold = sold;
	this.revenue=revenue;
	}
	public long getSold() {
		return sold;
	}
	public void setSold(long sold) {
		this.sold = sold;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public long getRevenue() {
		return revenue;
	}
	public void setRevenue(long revenue) {
		this.revenue = revenue;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (sold ^ (sold >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		if (ID != other.ID)
			return false;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sold != other.sold)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Author [ID=" + ID + ", name=" + name + ", age=" + age
				+ ", sold=" + sold + " ,revenue="+revenue+"]";
	}
	public static Comparator<Author> compare=new Comparator<Author>(){
		public int compare(Author a1, Author a2){
			return (int) -(a1.getSold()-a2.getSold());
		}
	};
	public static Comparator<Author> compare1=new Comparator<Author>(){
		public int compare(Author a1,Author a2){
			 if(a1.getRevenue()<a2.getRevenue()){
				 return -1;
			 }else if(a1.getRevenue()>a2.getRevenue()){
				 return 1;
			 }else {
				 return 0;
			 }
		}
	};
}
