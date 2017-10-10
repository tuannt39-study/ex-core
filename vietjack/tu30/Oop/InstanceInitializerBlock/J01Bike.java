package vietjack.tu30.Oop.InstanceInitializerBlock;

//Instance Initializer Block mà thực hiện việc khởi tạo

public class J01Bike {
	int speed;

	J01Bike() {
		System.out.println("speed is " + speed);
	}

	{
		speed = 100;
	}

	public static void main(String args[]) {
		J01Bike b1 = new J01Bike();
		J01Bike b2 = new J01Bike();
	}
}
