package vietjack.ex.loop;

// In các hình tam giác đặc biệt

import java.util.Scanner;

public class ForLoopControl {

	public static void main(String[] args) {
		System.out.println("Nhập số hàng: ");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		System.out.println("------------");
		for (int i=1; i<=rows; i++) {
			for (int j=1; j<=i; j++) {
//				System.out.print(j);
//				System.out.print(i);
				if ((i+j)%2==0) {
					System.out.print(0);
				} else {
					System.out.print(1);
				}
			}
			System.out.println();
		}
	}

}
