package vietjack.tu22.Oop.Constructor;

public class J03Student {
	int id;
	String name;

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		J03Student s1 = new J03Student();
		J03Student s2 = new J03Student();
		s1.display();
		s2.display();

	}

}
