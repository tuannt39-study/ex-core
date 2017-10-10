package vietjack.tu31.Oop.Final;

//Khởi tạo biến final trống. Nó chỉ có thể được khởi tạo trong Constructor.

public class J05Bike {
	final int speedlimit;// bien final trong

	J05Bike() {
		speedlimit = 70;
		System.out.println(speedlimit);
	}

	public static void main(String args[]) {
		new J05Bike();
	}
}
