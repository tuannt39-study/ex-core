package thantrieu.tu1;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class B19ForDoWhile {
	static boolean nguyenTo(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int n, number = 2, count = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		do {
			if (nguyenTo(number)) {
				System.out.println("number = " + number);
				count++;
			}
			number++;
		} while (count < n);
	}
}
