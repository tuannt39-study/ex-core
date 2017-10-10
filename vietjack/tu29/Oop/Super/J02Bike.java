package vietjack.tu29.Oop.Super;

//super được để tham chiếu biến instance của lớp cha gần nhất
//Có từ khóa super

public class J02Bike extends Vehicle {
	int speed = 100;

	void display() {
		System.out.println(super.speed); // bay gio se in speed cua Vehicle
	}

	public static void main(String args[]) {
		J02Bike b = new J02Bike();
		b.display();

	}

}
