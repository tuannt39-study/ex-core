package vietjack.tu24.Oop.This;

//Lời gọi this() constructor nên được sử dụng để tái sử dụng constructor.
//Nó duy trì dây chuyền giữa các Constructor, và được sử dụng cho Constructor Chaining

public class J05Student {
	int id;
	String name;
	String city;

	J05Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	J05Student(int id, String name, String city) {
		this(id, name); // Bay gio khong can khoi tao id va name
		this.city = city;
	}

	void display() {
		System.out.println(id + " " + name + " " + city);
	}

	public static void main(String[] args) {
		J05Student e1 = new J05Student(111, "Hoang");
		J05Student e2 = new J05Student(222, "Thanh", "NamDinh");
		e1.display();
		e2.display();
	}

}
