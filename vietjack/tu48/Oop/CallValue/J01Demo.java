package vietjack.tu48.Oop.CallValue;

//Ví dụ về gọi bởi giá trị trong Java
//Trong trường hợp gọi bởi giá trị, giá trị ban đầu không bị thay đổi. 

public class J01Demo {
	int data = 50;

	void change(int data) {
		data = data + 100;// cac thay doi se chi o trong bien cuc bo
	}

	public static void main(String args[]) {
		J01Demo op = new J01Demo();

		System.out.println("Truoc khi thay doi " + op.data);
		op.change(500);
		System.out.println("Sau khi thay doi " + op.data);

	}
}
