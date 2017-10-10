package vietjack.tu25.Oop.Inheritance;

//Toán tử instanceof để kiểm tra xem B có phải là một A và C có phải là một A.

public class J03InstanceOf extends B {

	public static void main(String[] args) {
		B m = new B();
		J03InstanceOf d = new J03InstanceOf();
		System.out.println(m instanceof A);
		System.out.println(d instanceof B);
		System.out.println(d instanceof A);
	}

}
