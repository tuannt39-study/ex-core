package vietjack.tu46.Oop.Array;

//Mảng một chiều trong Java

public class J01Array {
	public static void main(String[] args) {
		int[] a = new int[5]; // Khai bao va khoi tao
		a[0] = 10; // Khoi tao, gan gia tri
		a[1] = 20;
		a[2] = 50;
		a[3] = 40;
		a[4] = 30;

		int[] b = { 1, 3, 4, 5, 2 };
		// in mang
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for (int x : b) {
			System.out.print(x + " ");
		}

	}
}
