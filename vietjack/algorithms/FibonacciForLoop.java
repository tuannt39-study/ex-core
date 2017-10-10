package vietjack.algorithms;

import java.util.Scanner;

public class FibonacciForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập n = ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i < n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		System.out.println("Mảng Fibonacci với " + n + " phần tử");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
