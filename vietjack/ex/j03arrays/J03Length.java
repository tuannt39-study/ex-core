package vietjack.ex.j03arrays;

//Cách xác định giới hạn trên (kích thước) của Mảng (Array) hai chiều trong Java?

public class J03Length {
	public static void main(String args[]) {
		String[][] data = new String[2][5];
		System.out.println("Dimension 1: " + data.length);
		System.out.println("Dimension 2: " + data[0].length);
	}
}
