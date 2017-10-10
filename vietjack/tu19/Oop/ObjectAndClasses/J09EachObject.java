package vietjack.tu19.Oop.ObjectAndClasses;

public class J09EachObject {
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
		J09EachObject r1 = new J09EachObject(), r2 = new J09EachObject(); // Tao hai doi tuong

		r1.insert(11, 5);
		r2.insert(3, 15);

		r1.calculateArea();
		r2.calculateArea();
	}
}
