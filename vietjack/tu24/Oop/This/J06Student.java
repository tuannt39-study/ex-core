package vietjack.tu24.Oop.This;

//Lời gọi tới this() phải là lệnh đầu tiên trong Constructor.

public class J06Student {
	int id;
	String name;

	J06Student() {
		System.out.println("Constructor mac dinh duoc trieu hoi");
	}

	J06Student(int id, String name) {
		this();
		id = id;
		name = name;
//		this(); // phai la lenh dau tien
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		J06Student e1 = new J06Student(111, "Hoang");
		J06Student e2 = new J06Student(222, "Thanh");
		e1.display();
		e2.display();
	}

}
