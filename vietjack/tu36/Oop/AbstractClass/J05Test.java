package vietjack.tu36.Oop.AbstractClass;

//Người dùng cuối cùng không thể bị bắt buộc phải ghi đè tất cả phương thức của Interface đó.

public class J05Test {
	public static void main(String args[]) {
		ATest a = new MTest();
		a.a();
		a.b();
		a.c();
		a.d();
	}
}
