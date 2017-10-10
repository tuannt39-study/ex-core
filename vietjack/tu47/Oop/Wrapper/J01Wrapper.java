package vietjack.tu47.Oop.Wrapper;

//chuyển đổi từ kiểu gốc Primitive thành Wrapper

public class J01Wrapper {
	public static void main(String args[]) {
		// Chuyen doi int thanh Integer
		int a = 20;
		Integer i = Integer.valueOf(a);// Chuyen doi int thanh Integer
		Integer j = a;// Day la autoboxing, bay gio compiler se viet la Integer.valueOf(a)

		System.out.println(a + " " + i + " " + j);
	}
}
