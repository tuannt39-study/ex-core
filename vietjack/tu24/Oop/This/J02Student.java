package vietjack.tu24.Oop.This;

//Sử dụng từ khóa this. Tham số và biến instance là giống nhau.

public class J02Student {
	int id;
	String name;

	J02Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		J02Student s1 = new J02Student(111, "Hoang");
		J02Student s2 = new J02Student(222, "Thanh");
		s1.display();
		s2.display();
	}

}
