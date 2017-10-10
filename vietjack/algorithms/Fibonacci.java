package vietjack.algorithms;

import java.util.Scanner;

public class Fibonacci {

	static long[] memoization;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Nhập n = ");
		int num = in.nextInt();
		memoization = new long[num + 1];
		long result = findFibonacci(num);
		System.out.print("Fibonacci for number: ");
		System.out.println(num + " = " + result);
	}

	public static long findFibonacci(int num) {

		if (num <= 0) {
			return 0;
		} else {
			long fib = memoization[num];
			if (fib == 0) {
				if (num == 1) {
					memoization[num] = 1;
				} else {
					memoization[num] = findFibonacci(num - 1) + findFibonacci(num - 2);
				}
				fib = memoization[num];
			}
			return fib;
		}
	}
}