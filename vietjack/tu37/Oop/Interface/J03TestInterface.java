package vietjack.tu37.Oop.Interface;

//Đa kế thừa không được hỗ trợ thông qua lớp.
//Nhưng nó được hỗ trợ bởi Interface bởi vì không có tính lưỡng nghĩa khi trình triển khai được cung cấp bởi lớp Implementation

public class J03TestInterface implements Printable, Showable1 {

	public void print() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		J03TestInterface obj = new J03TestInterface();
		obj.print();
	}
}
//Trong ví dụ trên, Printable và Showable interface có cùng các phương thức nhưng trình triển khai 
//của nó được cung cấp bởi lớp J03TestInterface, vì thế không có tính lưỡng nghĩa ở đây.
