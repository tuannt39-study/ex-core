package vietjack.tu37.Oop.Interface;

//Trong ví dụ này, Printable Interface chỉ có một phương thức, trình triển khai của nó được cung cấp bởi lớp A.

public class J01ATest implements Printable {
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		J01ATest obj = new J01ATest();
		obj.print();
	}

}
