package vietjack.tu29.Oop.Super;

//Trong ví dụ này super() được cung cấp ngầm định bởi Compiler.

public class J04Bike extends Vehicle1 {
	int speed;

	J04Bike(int speed) {
		this.speed = speed;
		System.out.println(speed);
	}

	public static void main(String args[]) {
		J04Bike b = new J04Bike(10);
	}
}
