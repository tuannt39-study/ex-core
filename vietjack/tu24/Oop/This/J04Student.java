package vietjack.tu24.Oop.This;

//Lời gọi this() constructor có thể được sử dụng để triệu hồi Constructor của lớp hiện tại.

public class J04Student {
	int id;
	String name;

	J04Student() {
		System.out.println("Constructor mac dinh duoc goi");
	}

	J04Student(int id, String name) {
		this(); // no duoc su dung de goi constructor cua lop hien tai.
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		J04Student e1 = new J04Student(111, "Hoang");
		J04Student e2 = new J04Student(222, "Thanh");
		e1.display();
		e2.display();
	}

}
