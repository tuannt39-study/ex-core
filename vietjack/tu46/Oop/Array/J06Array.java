package vietjack.tu46.Oop.Array;

//Cộng hai ma trận trong Java

public class J06Array {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		String[][] names = { { "Mr. ", "Mrs. ", "Ms. " }, { "Smith", "Jones" } };
		// Mr. Smith
		System.out.println(names[0][0] + names[1][0]);
		// Ms. Jones
		System.out.println(names[0][2] + names[1][1]);

		// tao hai ma tran
		int a[][] = { { 1, 3, 4 }, { 3, 4, 5 } };
		System.out.println("Ma trận a: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		int b[][] = { { 1, 3, 4 }, { 3, 4, 5 } };
		System.out.println("Ma trận b: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		// tao ma tran khac de luu giu ket qua phep cong hai ma tran
		int c[][] = new int[2][3];
		System.out.println("Ma trận c: ");
		// cong va in tong hai ma tran
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();// new line
		}

	}

}
