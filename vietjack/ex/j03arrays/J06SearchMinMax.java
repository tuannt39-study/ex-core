package vietjack.ex.j03arrays;

import java.util.Arrays;
import java.util.Collections;

//Cách tìm phần tử nhỏ nhất và lớn nhất trong một Mảng (Array) trong Java?

public class J06SearchMinMax {
	public static void main(String[] args) {
		Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5 };
		
		//Tìm phần tử nhỏ nhất và lớn nhất trong một Mảng (Array) bởi sử dụng phương thức Collection.max() và Collection.min() trong Java
		int min = (int) Collections.min(Arrays.asList(numbers));
		int max = (int) Collections.max(Arrays.asList(numbers));
		System.out.println("Min number: " + min);
		System.out.println("Max number: " + max);
	}
}
