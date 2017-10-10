package thantrieu.ex2;

import java.util.Scanner;

//Tam giác sao, số đối xứng

public class B03 {

	static void inSao(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + n; j++) {
				if (j < n - 1 - i)
					System.out.print("   ");
				else
					System.out.print(" * ");
			}
			System.out.println();
		}
	}

	static void inSo(int m) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < i + m; j++) {
				if (j < m - 1 - i)
					System.out.print("   ");
				else {
					if (j == m - 1) {
						System.out.print(i + 1);
					} else {
						for (int k = 0; k <= i; k++) {
							if (Math.abs(j - m + 1) == k) {
								System.out.print(" " + (i - k + 1) + " ");
							}
						}
					}
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n, m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so 1: ");
		n = sc.nextInt();
		inSao(n);
		System.out.println("Nhap so 2: ");
		m = sc.nextInt();
		inSo(m);
	}

}
