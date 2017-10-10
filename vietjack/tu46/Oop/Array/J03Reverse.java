package vietjack.tu46.Oop.Array;

//Trả về một mảng từ một phương thức trong Java

public class J03Reverse {

	static void hamDaoNguoc(int[] arr) {
		int[] result = new int[arr.length];
		for (int i = 0, j = result.length - 1; i < arr.length; i++, j--) {
			result[j] = arr[i];
		}
		System.out.println();
		System.out.println("Mảng đã đảo ngược: ");
		for (int a : result) {
			System.out.print(a + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 9, 3, 5, 4, 6, 2, 7 };
		for (int a : arr) {
			System.out.print(a + " ");
		}
		hamDaoNguoc(arr);
	}

}
