package vietjack.tu16.Numbers;
//round() trong Java

public class J11round {
	public static void main(String args[]) {
		double d = 100.675;
		double e = 100.500;
		float f = 100;
		float g = 90f;

		// Trả về long hoặc int gần nhất, như kiểu dữ liệu được chỉ dẫn bởi phương thức, với tham số.
		System.out.println(Math.round(d));
		System.out.println(Math.round(e));
		System.out.println(Math.round(f));
		System.out.println(Math.round(g));
	}
}
