package vietjack.tu37.Oop.Interface;

//Nếu một lớp triển khai đa kế thừa, hoặc một Interface kế thừa từ nhiều Interface thì đó là đa kế thừa.

public class J02ATest implements Printable, Showable {

	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String args[]) {
		J02ATest obj = new J02ATest();
		obj.print();
		obj.show();
	}

}
