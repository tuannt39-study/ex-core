package vietjack.ex.j16regularexpresstion;

//Cách xóa các khoảng trống trắng trong Java?

import java.util.Scanner;

public class J08RemoveSpace {
	public static void main(String[] args) {
		String s1 = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string:");
		s1 = scan.nextLine();
		System.out.println("\nInput String is:\n" + s1);
		String s2 = s1.replaceAll("\\s+", "");
		System.out.println("\nOutput String is:\n" + s2);
	}

}
