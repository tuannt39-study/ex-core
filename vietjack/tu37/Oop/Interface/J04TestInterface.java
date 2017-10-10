package vietjack.tu37.Oop.Interface;

//Một lớp triển khai Interface nhưng một Interface kế thừa từ Interface khác

public class J04TestInterface implements Showable2 {

	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String args[]) {
		J04TestInterface obj = new J04TestInterface();
		obj.print();
		obj.show();
	}

}
