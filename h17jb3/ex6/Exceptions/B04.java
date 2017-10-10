package h17jb3.ex6.Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class B04 {

	public static void main(String[] args) throws IOException {
		try {
			Scanner sc = new Scanner(System.in);
			int a, b;
			System.out.print("Nhap a: ");
			a=sc.nextInt();
			System.out.print("Nhap b: ");
			b=sc.nextInt();
			System.out.println("Tong: " + a + " + " + b + " = " + (a+b));
		} catch (NumberFormatException e) {
			System.out.print("Nhap lai: ");
		}
	}
	
}
