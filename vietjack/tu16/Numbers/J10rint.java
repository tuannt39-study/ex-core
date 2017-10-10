package vietjack.tu16.Numbers;
//rint() trong Java

public class J10rint {
	public static void main(String args[]) {
		double d = 100.675;
		double e = 100.500;
		double f = 100.200;

		// Làm tròn số, trả về giá trị integer gần nhất với giá trị tham số. Giá trị trả về ở dạng double.
		System.out.println(Math.rint(d));
		System.out.println(Math.rint(e));
		System.out.println(Math.rint(f));
	}
}
