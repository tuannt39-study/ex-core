package vietjack.tu16.Numbers;
//cos() trong Java

public class J19cos {
	public static void main(String args[]) {
		double degrees = 45.0;
		double radians = Math.toRadians(degrees);

		// Trả về cos của giá trị double đã cho.
		System.out.format("Gia tri cua pi la %.4f%n", Math.PI);
		System.out.format("Cos cua %.1f degree la %.4f%n", degrees, Math.cos(radians));

	}
}
