package vietjack.tu36.Oop.AbstractClass;

//Ví dụ về lớp trừu tượng và phương thức trừu tượng trong Java

//lop truu tuong Bike
abstract class Bike1 {
	abstract void run(); // phuong thuc truu tuong voi tu khoa abstract
}

// lop Honda4 ke thua lop truu tuong Bike
public class J01Honda extends Bike1 {
	void run() {
		System.out.println("Dang chay mot cach an toan..");
	}

	// phuong thuc main()
	public static void main(String args[]) {
		Bike1 obj = new J01Honda();
		J01Honda obj1 = new J01Honda();
		obj.run();
		obj1.run();
	}
}