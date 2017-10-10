package h17jb3.tu3.Collections;
//Ví dụ Arrays

import java.util.Arrays;

public class TestArray {
	public static void main(String[] args) {
		int a[] = new int[3];
		a[0] = 9;
		a[1] = 5;
		a[2] = 8;

		Arrays.sort(a);

		System.out.println("Array after sorted: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
}
