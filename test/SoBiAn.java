package test;

import java.util.Scanner;

public class SoBiAn {

	public static void main(String[] args) {
		final int MaxNumber = 100;
		final int MinNumber = 1;
		int range = (MaxNumber - MinNumber) + 1;
		int secretNumber = (int) (Math.random() * range) + MinNumber;
		int yourNumber = 0;
		Scanner sc = new Scanner(System.in);
		while (yourNumber != secretNumber) {
			System.out.println("Nhập số: ");
			yourNumber = sc.nextInt();
			if (yourNumber > secretNumber) {
				System.out.println("Số bạn nhập > Số bí ẩn");
			} else if (yourNumber < secretNumber) {
				System.out.println("Số bạn nhập < Số bí ẩn");
			} else {
				System.out.println("Số bạn nhập = Số bí ẩn");
			}
			System.out.println(secretNumber);
		}
	}

}
