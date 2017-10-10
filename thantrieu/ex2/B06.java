package thantrieu.ex2;

//Viết chương trình tính tổng S = 1+3+5+ ...+ n nếu n lẻ, S = 2 + 4 + ... + n nếu n chẵn
import java.util.Scanner;

public class B06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum = 0, i;
		System.out.print("Nhap n: ");
		n = sc.nextInt();
		System.out.print("Tong sum: ");
		if (n % 2 == 0) {
			i = 2;
			while (i <= n) {
				System.out.print(i + " + ");
				sum += i;
				i += 2;
			}
		} else {
			i = 1;
			while (i <= n) {
				System.out.print(i + " + ");
				sum += i;
				i += 2;
			}
		}
		System.out.println("\nsum = " + sum);
	}

}
