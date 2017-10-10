package vietjack.tu46.Oop.Array;

//Truyền mảng tới phương thức trong Java

public class J02Array {

	static void min(int arr[]) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		int a[] = new int[5];
		int[] b = { 10, 20, 2, 30, 40 };
		a[0] = 10;
		a[1] = 20;
		a[2] = 50;
		a[3] = 30;
		a[4] = 5;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " - " + b[i] + "; ");
		}

		System.out.print("Giá trị nhỏ nhất trong mảng a: ");
		min(a);

		System.out.print("Giá trị nhỏ nhất trong mảng b: ");
		min(b);
		
		for (int hello : a) {
			System.out.print(hello + " ");
		}
		System.out.println();
		for (int hello1 : b) {
			System.out.print(hello1 + " ");
		}

	}

}
