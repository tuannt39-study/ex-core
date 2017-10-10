package thantrieu.ex1;

//Viết chương trình nhập bán kính của hình tròn và tính chu vi, diện tích hình tròn đó
import java.util.Scanner;
import static java.lang.Math.PI;

public class B07 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			System.out.println("Ban kinh hinh tron: ");
			n = sc.nextInt();
			if (n > 0) {
				System.out.println("Chu vi hinh tron la = " + (2 * n * PI));
				System.out.println("Dien tich hinh tron la = " + (n * n * PI));
				break;
			} else
				System.out.println("Gia tri khong hop le!\nNhap lai ban kinh hinh tron lan " + i + " : ");
		}
	}
}
