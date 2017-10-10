package vietjack.tu22.Oop.Constructor;

//Sao chép các giá trị mà không sử dụng Constructor

public class J06CopyConstructor {
	int id;
	String name;

	J06CopyConstructor(int i, String n) {
		id = i;
		name = n;
	}

	J06CopyConstructor() {
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		J06CopyConstructor s1 = new J06CopyConstructor(111, "Hoang");
		J06CopyConstructor s2 = new J06CopyConstructor();
		s2.id = s1.id;
		s2.name = s1.name;
		s1.display();
		s2.display();
	}
}
