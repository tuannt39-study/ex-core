package vietjack.tu31.Oop.Final;

//Phương thức final được kế thừa nhưng bạn không thể ghi đè nó

class Bike4 {
	final void run() {
		System.out.println("dang chay...");
	}
}

public class J04Honda extends Bike4 {
	public static void main(String args[]) {
		new J04Honda().run();
	}

}
