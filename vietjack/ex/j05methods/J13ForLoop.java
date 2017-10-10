package vietjack.ex.j05methods;

//Cách sử dụng vòng lặp for và foreach để hiển thị các phần tử trong một Mảng (Array) trong Java?

public class J13ForLoop {
	public static void main(String[] args) {
		int[] intary = { 1, 2, 3, 4 };
		forDisplay(intary);
		foreachDisplay(intary);
	}

	public static void forDisplay(int[] a) {
		System.out.println("Display an array using for loop");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void foreachDisplay(int[] data) {
		System.out.println("Display an array using for each loop");
		for (int a : data) {
			System.out.print(a + " ");
		}
	}
}
