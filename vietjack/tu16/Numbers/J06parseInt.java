package vietjack.tu16.Numbers;
//parseInt() trong Java

public class J06parseInt {
	public static void main(String args[]) {

		// Phương thức này được sử dụng để nhận kiểu dữ liệu gốc của một String cụ thể
		int x = Integer.parseInt("9");
		double c = Double.parseDouble("5");
		int b = Integer.parseInt("444", 16);

		System.out.println(x);
		System.out.println(c);
		System.out.println(b);
	}
}
