package vietjack.tu36.Oop.AbstractClass;

//Lớp trừu tượng có thể có thành viên dữ liệu, phương thức trừu tượng, constructor, và có thể cả phương thức main().

//vi du ve lop abstract ma co than phuong thuc 
abstract class Bike4 {
	Bike4() {
		System.out.println("bike duoc tao");
	}

	abstract void run();

	void changeGear() {
		System.out.println("gear duoc thay doi");
	}
}

class Honda4 extends Bike4 {
	void run() {
		System.out.println("dang chay mot cach an toan..");
	}
}

public class J04HondaTest {
	public static void main(String args[]) {
		Bike4 obj4 = new Honda4();
		obj4.run();
		obj4.changeGear();
	}
}