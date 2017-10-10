package vietjack.tu24.Oop.This;

//Từ khóa this có thể được truyền như là tham số trong lời gọi constructor

class B {
	J09Student obj;

	B(J09Student obj) {
		this.obj = obj;
	}

	void display() {
		System.out.println(obj.data); // su dung thanh vien du lieu cua lop J09Student
	}
}

public class J09Student {
	int data = 10;

	J09Student() {
		B b = new B(this);
		b.display();
	}

	public static void main(String args[]) {
		J09Student a = new J09Student();
	}
}