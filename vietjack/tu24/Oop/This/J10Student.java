package vietjack.tu24.Oop.This;

//Từ khóa this có thể được sử dụng để trả về instance của lớp hiện tại

class A {
	A getA() {
		return this;
	}

	void msg() {
		System.out.println("Hello World");
	}
}

public class J10Student {
	public static void main(String args[]) {
		new A().getA().msg();
	}
}
