package vietjack.tu16.Numbers;
//sin() trong Java

public class J18sin {
	public static void main(String args[]) {
		double degrees = 45.0;
		double radians = Math.toRadians(degrees);

		// Trả về sin của giá trị double đã cho.
		System.out.format("Gia tri cua pi la %.4f%n", Math.PI);
		System.out.format("Sin cua %.1f degree la %.4f%n", degrees, Math.sin(radians));

	}
}
