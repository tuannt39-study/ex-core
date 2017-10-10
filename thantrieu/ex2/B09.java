package thantrieu.ex2;
//Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ. Ví dụ: Số  8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32

import java.util.Scanner;

public class B09 {

	public static void main(String[] args) {
		int n, m, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		n = sc.nextInt();
		m = n;
		System.out.print("sum = ");
		while (n > 0) {
			System.out.print(n % 10 + " + ");
			sum += n % 10;
			n /= 10;
		}
		System.out.println("\nTong cac chu so cua " + m + " = " + sum);
	}

}
