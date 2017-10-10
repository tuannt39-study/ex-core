package vietjack.tu47.Oop.Wrapper;

//chuyển đổi từ Wrapper thành kiểu gốc Primitive

public class J02Wrapper {
	public static void main(String args[]) {
		// Chuyen doi Integer thanh int
		Integer a = new Integer(3);
		int i = a.intValue();// Chuyen doi Integer thanh int
		int j = a;// Day la unboxing, bay gio compiler se viet la a.intValue()

		System.out.println(a + " " + i + " " + j);
	}
}
