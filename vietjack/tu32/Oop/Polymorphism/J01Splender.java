package vietjack.tu32.Oop.Polymorphism;

//Khi biến tham chiếu của lớp cha tham chiếu tới đối tượng của lớp con, thì đó là Upcasting
//Khi việc gọi phương thức được quyết định bởi JVM chứ không phải Compiler
//Vì thế đó là đa hình tại runtime.

public class J01Splender extends Bike {
	void run() {
		System.out.println("chay an toan voi 60km");
	}

	public static void main(String args[]) {
		Bike b = new J01Splender();// day la upcasting
		b.run();
	}

}
