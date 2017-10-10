package vietjack.tu31.Oop.Final;

//Nếu bạn tạo bất cứ phương thức nào là final, thì bạn không thể ghi đè nó.

class Bike2 {
	final void run() {
		System.out.println("running");
	}
}

public class J02Honda extends Bike2 {
	//Không thể thực hiện được.
//	void run() { 
//		System.out.println("Chay an toan voi 100kmph");
//	}

	public static void main(String args[]) {
		J02Honda J02Honda = new J02Honda();
		J02Honda.run();
	}
}