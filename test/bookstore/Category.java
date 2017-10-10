package test.bookstore;

import java.util.Comparator;

public class Category {
	private int ID;
	private String name;
	private long sold;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getSold() {
		return sold;
	}
	public void setSold(long sold) {
		this.sold = sold;
	}
	public Category(int iD, String name, long sold) {
		super();
		ID = iD;
		this.name = name;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
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
		Category other = (Category) obj;
		if (ID != other.ID)
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

	public static Comparator<Category> compare=new Comparator<Category>() {
		public int compare(Category c1, Category c2){
			return (int) -(c1.getSold()-c2.getSold());
		}
	};
	@Override
	public String toString() {
		return "Category [ID=" + ID + ", name=" + name + ", sold=" + sold + "]";
	}
}
