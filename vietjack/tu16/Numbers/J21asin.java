package vietjack.tu16.Numbers;
//asin() trong Java

public class J21asin {
	public static void main(String args[]) {
		double degrees = 45.0;
		double radians = Math.toRadians(degrees);

		// Trả về arcsin của giá trị double đã cho.
		System.out.format("Gia tri cua pi la %.4f%n", Math.PI);
		System.out.format("Arcsin cua %.4f la %.4f degrees %n", Math.sin(radians),
				Math.toDegrees(Math.asin(Math.sin(radians))));

	}
}
