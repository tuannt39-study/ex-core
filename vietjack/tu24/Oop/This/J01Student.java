package vietjack.tu24.Oop.This;

//không sử dụng từ khóa this. Tham số và biến instance là giống nhau.

public class J01Student {
	int id;
	String name;

	J01Student(int id, String name) {
		id = id;
		name = name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		J01Student s1 = new J01Student(111, "Hoang");
		J01Student s2 = new J01Student(321, "Thanh");
		s1.display();
		s2.display();
	}

}
