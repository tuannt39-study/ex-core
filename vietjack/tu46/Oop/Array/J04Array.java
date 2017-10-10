package vietjack.tu46.Oop.Array;

//Mảng hai chiều và đa chiều trong Java

public class J04Array {
	public static void main(String args[]) {

		// khai bao va khoi tao mang 2 chieu
		int arr[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 } };

		// in mang hai chieu
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
