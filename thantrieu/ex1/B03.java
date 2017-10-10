package thantrieu.ex1;

//Nhập vào hai số nguyên a, b. In ra màn hình tổng, hiệu, tích, thương của chúng
import java.util.Scanner;

public class B03 {
	public static void main(String[] args) {
		float a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập a = ");
		a = sc.nextFloat();
		System.out.println("Nhập b = ");
		b = sc.nextFloat();
		System.out
				.println("Tổng = " + (a + b) + "\nTích = " + (a * b) + "\nThương = " + (a / b) + "\nHiệu = " + (a - b));
	}
}
