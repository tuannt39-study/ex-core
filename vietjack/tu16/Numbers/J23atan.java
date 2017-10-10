package vietjack.tu16.Numbers;
//atan() trong Java

public class J23atan {
	public static void main(String args[]) {
		double degrees = 45.0;
		double radians = Math.toRadians(degrees);

		// Trả về arctan của giá trị double đã cho
		System.out.format("Gia tri cua pi la %.4f%n", Math.PI);
		System.out.format("Arctan cua %.4f la %.4f degrees %n", Math.cos(radians),
				Math.toDegrees(Math.atan(Math.sin(radians))));

	}
}
