package vietjack.tu46.Oop.Array;

//Sao chép một mảng trong Java

import java.util.Arrays;

public class J05Array {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6 };
		Class c = arr.getClass();
		String name = c.getName();
		System.out.println(name);

		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
		char[] copyTo = new char[7];
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		System.out.println(new String(copyFrom));
		System.out.println(new String(copyTo));

		char[] copyFrom1 = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
		char[] copyTo1 = Arrays.copyOfRange(copyFrom1, 2, 9);
		System.out.println(new String(copyFrom1));
		System.out.println(new String(copyTo1));

	}

}
