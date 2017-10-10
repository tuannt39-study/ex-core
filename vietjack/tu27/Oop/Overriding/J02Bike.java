package vietjack.tu27.Oop.Overriding;

//Ví dụ về ghi đè phương thức trong Java

public class J02Bike extends Vehicle {
	void run() {
		System.out.println("Bike dang chay an toan");
	}

	public static void main(String args[]) {
		J02Bike obj = new J02Bike();
		obj.run();
	}
}
