package thantrieu.tu1;

import java.util.Scanner;

public class B21Continue {
	public static void main(String[] args) {
		int n;
		Scanner sc2 = new Scanner(System.in);
		n = sc2.nextInt();
		for (int i = 0; i <= n; i++) {
			if (i == 5)
				continue;
			System.out.println("i = " + i);
		}
		System.out.println("Đây là câu lệnh sau khối for 2");
	}
}
