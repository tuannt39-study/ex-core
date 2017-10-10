package vietjack.tu16.Numbers;
//ceil() trong Java

public class J08ceil {
	public static void main(String args[]) {
		double d = -100.675;
		float f = -90;

		// Trả về số integer nhỏ nhất mà lớn hơn hoặc bằng tham số. Giá trị trả về ở dạng double.
		System.out.println(Math.ceil(d));
		System.out.println(Math.ceil(f));

		System.out.println(Math.floor(d));
		System.out.println(Math.floor(f));
	}
}
