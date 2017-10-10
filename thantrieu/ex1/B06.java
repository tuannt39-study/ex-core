package thantrieu.ex1;

//Viết chương trình nhập vào hai cạnh của hình chữ nhật và tính chu vi và diện tích của hình chữ nhật đó.
import java.util.Scanner;

public class B06 {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			System.out.println("Nhap canh a = ");
			a = sc.nextInt();
			System.out.println("Nhap canh b = ");
			b = sc.nextInt();
			if (a > 0 && b > 0) {
				System.out.println("Chu vi HCN = " + ((a + b) / 2));
				System.out.println("Dien tich HCN = " + (a * b));
				break;
			} else
				System.out.println("Nhap gia tri canh a, b khong hop le.\nNhap lai a, b lan " + i + " :");
		}
	}
}
