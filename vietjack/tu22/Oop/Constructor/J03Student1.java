package vietjack.tu22.Oop.Constructor;

//Constructor được tham số hóa trong Java

public class J03Student1 {
	int id;
	String name;

	J03Student1(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		J03Student1 s1 = new J03Student1(111, "Karan");
		J03Student1 s2 = new J03Student1(222, "Aryan");
		s1.display();
		s2.display();
	}
}
