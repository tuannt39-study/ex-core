package vietjack.tu31.Oop.Final;

//Nếu bạn tạo bất cứ lớp nào là final thì bạn không thể kế thừa nó.

final class Bike3 {
}

// public class J03Honda extends Bike { //Không thể thực hiện được.
public class J03Honda {
	void run() {
		System.out.println("Chay an toan voi 100kmph");
	}

	public static void main(String args[]) {
		J03Honda honda = new J03Honda();
		honda.run();
	}
}