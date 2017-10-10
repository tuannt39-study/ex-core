package vietjack.tu22.Oop.Constructor;

//Trong ví dụ này, chúng ta sao chép các giá trị của một đối tượng vào trong đối tượng khác bởi sử dụng Constructor trong Java.

public class J05CopyConstructor {
	int id;
	String name;

	J05CopyConstructor(int i, String n) {
		id = i;
		name = n;
	}

	J05CopyConstructor(J05CopyConstructor s) {
		id = s.id;
		name = s.name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		J05CopyConstructor s1 = new J05CopyConstructor(111, "Hoang");
		J05CopyConstructor s2 = new J05CopyConstructor(s1);
		s1.display();
		s2.display();
	}
}
