package thantrieu.ex2;

//Nhập số tự nhiên  n  rồi tính tổng (lưu ý phép chia các số nguyên): S =1+1/2+1/3+...+1/n
import java.util.Scanner;

public class B07 {

	public static void main(String[] args) {
		int n;
		System.out.print("Nhap n = ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += (1.0 / i);
			// sum+=(double)1/i;
		}
		System.out.println("Sum = " + sum);

	}

}
