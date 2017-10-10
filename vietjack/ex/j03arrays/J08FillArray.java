package vietjack.ex.j03arrays;

import java.util.Arrays;

//Cách fill (khởi tạo ngay lập tức) một Mảng (Array) trong Java?

public class J08FillArray {
	public static void main(String args[]) {
		int array[] = new int[6];
		
		// fill (khởi tạo tất cả phần tử của Mảng (Array) ngay lập tức) một Mảng (Array) bởi sử dụng Array.fill(arrayname,value)
		//Và Array.fill(arrayname, starting index ,ending index ,value) của lớp Java Util trong Java.
		
		Arrays.fill(array, 100);
		for (int i = 0, n = array.length; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		Arrays.fill(array, 3, 6, 50);
		for (int i = 0, n = array.length; i < n; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
