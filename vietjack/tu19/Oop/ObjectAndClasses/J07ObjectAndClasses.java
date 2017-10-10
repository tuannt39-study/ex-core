package vietjack.tu19.Oop.ObjectAndClasses;

public class J07ObjectAndClasses {
	int length;
	int width;

	void insert(int l, int w) {
		length = l;
		width = w;
	}

	void calculateArea() {
		System.out.println(length * width);
	}

	public static void main(String args[]) {
		J07ObjectAndClasses r1 = new J07ObjectAndClasses();
		J07ObjectAndClasses r2 = new J07ObjectAndClasses();

		r1.insert(11, 5);
		r2.insert(3, 15);

		r1.calculateArea();
		r2.calculateArea();
	}
}
