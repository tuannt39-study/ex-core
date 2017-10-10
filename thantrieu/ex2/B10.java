package thantrieu.ex2;

//Viết chương trình phân tích một số nguyên thành các thừa số nguyên tố, Ví dụ: Số 28 được phân tích thành 2 x 2 x 7
import java.util.Scanner;

public class B10 {

	static void phanTich(int n) {
		int i = 2;
		while (n > 0) {
			if (n % i == 0) {
				if (n == i) {
					System.out.print(i);
				} else
					System.out.print(i + " * ");
					n /= i;
			} else
				i++;
		}
	}

	static int tong(int n) {
		int tg = 0;
		while (n > 0) {
			tg += n % 10;
			n /= 10;
		}
		return tg;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhap n: ");
		n = sc.nextInt();
		System.out.println("Tong cac chu so cua n = " + tong(n));
		System.out.print("Phan tich n thanh cac thua so nguyen to: ");
		phanTich(n);
	}

}
