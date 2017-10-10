package vietjack.tu26.Oop.HASA;

//Ví dụ đơn giản về quan hệ HAS-A trong Java

public class J01Circle {
	Operation op; // quan hệ HAS-A
	double pi = 3.14;

	double area(int radius) {
		op = new Operation();
		int rsquare = op.square(radius); // tai su dung code (vi du: uy quyen cho loi goi phuong thuc).
		return pi * rsquare;
	}

	public static void main(String args[]) {
		J01Circle c = new J01Circle();
		double result = c.area(5);
		System.out.println(result);
	}
}
