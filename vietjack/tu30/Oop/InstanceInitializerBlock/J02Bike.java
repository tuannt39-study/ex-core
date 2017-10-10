package vietjack.tu30.Oop.InstanceInitializerBlock;

//Instance Initializer Block được triệu hồi tại thời điểm tạo đối tượng.
//Java Compiler sao chép Instance Initializer Block trong Constructor sau lệnh super() đầu tiên

public class J02Bike {
	int speed;

	J02Bike() {
		System.out.println("constructor duoc trieu hoi");
	}

	{
		System.out.println("instance initializer block duoc trieu hoi");
	}

	public static void main(String args[]) {
		J02Bike b1 = new J02Bike();
		J02Bike b2 = new J02Bike();
	}
}
