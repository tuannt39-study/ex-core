package vietjack.tu16.Numbers;
//acos() trong Java

public class J22acos {
	public static void main(String args[]) {
		double degrees = 45.0;
		double radians = Math.toRadians(degrees);

		// Trả về arccos của giá trị double đã cho
		System.out.format("Gia tri cua pi la %.4f%n", Math.PI);
		System.out.format("Arcos cua %.4f la %.4f degrees %n", Math.cos(radians),
				Math.toDegrees(Math.acos(Math.sin(radians))));

	}
}
