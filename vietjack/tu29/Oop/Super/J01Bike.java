package vietjack.tu29.Oop.Super;

//super được để tham chiếu biến instance của lớp cha gần nhất
//Không có từ khóa super

public class J01Bike extends Vehicle {
	int speed = 100;

	void display() {
		System.out.println(speed); // se in speed cua Bike
	}

	public static void main(String args[]) {
		J01Bike b = new J01Bike();
		b.display();
	}

}
