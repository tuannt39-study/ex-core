package vietjack.tu16.Numbers;
//Number valueOf() trong Java

public class J04valueOf {
	public static void main(String args[]) {

		// Trả về một đối tượng integer giữ giá trị gốc đã xác định
		Integer x = Integer.valueOf(9);
		Double c = Double.valueOf(5);
		Float a = Float.valueOf("80");
		Integer b = Integer.valueOf("444", 16);

		System.out.println(x);
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
	}
}
