package h17jb3.tu5.Exceptions;
//VÍ DỤ 2

public class MyDivision {
	public static void main(String[] args) {
		System.out.println("Goi phuong thuc A()");
		A();
		System.out.println("Chuong trinh ket thuc binh thuong");
	}

	public static void A() {
		B();
	}

	public static void B() {
		C();
	}

	public static void C() {
		float a = 2 / 0;
	}
}
// Giải thích: Phương thức A() gọi B(), B() gọi C(), C() gây ra lỗi chia cho 0
// và hệ thống “ném” ra một exception thuộc lớp ArithmeticException . Sau đó
// chương trình kết thúc.
