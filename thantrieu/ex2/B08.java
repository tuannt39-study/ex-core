package thantrieu.ex2;
//Nhập số tự nhiên n rồi liệt kê các ước số của nó. Có bao nhiêu ước số?

import java.util.Scanner;

public class B08 {

	public static void main(String[] args) {
		System.out.println("Nhap n nguyen duong: ");
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("n co " + count + " uoc");
	}

}
