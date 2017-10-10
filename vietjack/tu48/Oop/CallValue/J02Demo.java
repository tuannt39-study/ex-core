package vietjack.tu48.Oop.CallValue;

//Ví dụ khác về gọi bởi giá trị trong Java
//Trong gọi bởi tham chiếu, giá trị ban đầu bị thay đổi nếu chúng ta tạo thay đổi trong phương thức được gọi

public class J02Demo {
	int data = 50;

	void change(J02Demo op) {
		op.data = op.data + 100;// Cac thay doi se la trong bien instance
	}

	public static void main(String args[]) {
		J02Demo op = new J02Demo();

		System.out.println("Truoc khi thay doi " + op.data);
		op.change(op);// truyen doi tuong
		System.out.println("Sau khi thay doi " + op.data);

	}
}
