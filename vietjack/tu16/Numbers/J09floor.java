package vietjack.tu16.Numbers;
//floor() trong Java

public class J09floor {
	public static void main(String args[]) {
		double d = -100.675;
		float f = -90;

		// Trả về số integer lớn nhất mà nhỏ hơn hoặc bằng tham số. Giá trị trả về ở dạng double.
		System.out.println(Math.floor(d));
		System.out.println(Math.floor(f));

		System.out.println(Math.ceil(d));
		System.out.println(Math.ceil(f));
	}
}
