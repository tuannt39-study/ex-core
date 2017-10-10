package vietjack.tu24.Oop.This;

//Từ khóa this tham chiếu tới biến instance của lớp hiện tại
//In biến tham chiếu và this, kết quả của chúng là giống nhau.

public class J11Student {
	void m() {
		System.out.println(this);// in ra cung tham chieu ID
	}

	public static void main(String args[]) {
		J11Student obj = new J11Student();
		System.out.println(obj);// in tham chieu ID

		obj.m();
	}
}
