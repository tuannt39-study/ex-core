package vietjack.tu29.Oop.Super;

//super được sử dụng để triệu hồi phương thức của lớp cha gần nhất

public class J05Student extends Person {

	void message() {
		System.out.println("Xin chào Java");
	}

	void display() {
		message(); // se trieu hoi phuong thuc message() cua lop hien tai
		super.message(); // se trieu hoi phuong thuc message() cua lop cha
	}

	public static void main(String[] args) {
		J05Student s = new J05Student();
		s.display();
	}
}
