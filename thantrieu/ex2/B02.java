package thantrieu.ex2;

//Nhập vào kích thước chiều rộng, chiều cao và in ra hình chữ nhật các dấu * nhưng rỗng bên trong.

import java.util.Scanner;

public class B02 {

	public static void main(String[] args) {
		int m, n;
		System.out.println("Nhap vao so hang, so cot: ");
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == m - 1 || j == 0 || j == n - 1)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println("");
		}

	}

}
