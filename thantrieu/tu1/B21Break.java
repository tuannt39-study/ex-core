package thantrieu.tu1;

import java.util.Scanner;

public class B21Break {
	public static void main(String[] args) {
		int n;
		Scanner sc1 = new Scanner(System.in);
		n = sc1.nextInt();
		for (int i = 0; i <= n; i++) {
			if (i == 5)
				break;
			System.out.println("i = " + i);
		}
		System.out.println("Đây là câu lệnh sau khối for 1");
	}
}
