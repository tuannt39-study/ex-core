package thantrieu.tu1;

import java.util.Scanner;

public class B20For {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0)
				System.out.println("i = " + i);
		}
		System.out.println("Đây là câu lệnh sau khối for");
	}
}
