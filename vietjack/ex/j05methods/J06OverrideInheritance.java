package vietjack.ex.j05methods;

//Cách sử dụng override (ghi đè) phương thức trong Tính kế thừa cho các lớp phụ trong Java?
//Override (ghi đè) phương thức bởi các lớp phụ với số lượng và các kiểu tham biến trong Java.
public class J06OverrideInheritance {
	public static void main(String[] agrs) {
		Figure f = new Figure(10, 10);
		Rectangle r = new Rectangle(9, 5);
		Figure figref;
		figref = f;
		System.out.println("Area is :" + figref.area());
		figref = r;
		System.out.println("Area is :" + figref.area());
	}
}

class Figure {
	double dim1;
	double dim2;

	Figure(double a, double b) {
		dim1 = a;
		dim2 = b;
	}

	Double area() {
		System.out.println("Inside area for figure.");
		return (dim1 * dim2);
	}
}

class Rectangle extends Figure {
	Rectangle(double a, double b) {
		super(a, b);
	}

	Double area() {
		System.out.println("Inside area for rectangle.");
		return (dim1 * dim2);
	}
}