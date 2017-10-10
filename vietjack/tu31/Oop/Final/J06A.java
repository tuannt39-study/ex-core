package vietjack.tu31.Oop.Final;

//Một biến static final mà không được khởi tạo tại thời điểm khai báo thì đó là biến static final trống.
//Nó chỉ có thể được khởi tạo trong khối static.

public class J06A {
	static final int data;// bien static final trong
	static {
		data = 50;
	}

	public static void main(String args[]) {
		System.out.println(J06A.data);
	}
}
