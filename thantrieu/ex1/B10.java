package thantrieu.ex1;

//Nhập vào ba số a, b, c (là các số thực không âm). Tam Giac (Thường, cân, vuông, vuông cân, hay đều).
import java.util.Scanner;

public class B10 {
	public static void main(String[] args) {
		float a, b, c;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			System.out.println("Nhap a = ");
			a = sc.nextFloat();
			System.out.println("Nhap b = ");
			b = sc.nextFloat();
			System.out.println("Nhap c = ");
			c = sc.nextFloat();
			if (a > 0 && b > 0 && c > 0) {
				if ((a + b) > c || (a + c) > b || (b + c) > a) {
					System.out.println("a, b, c la 3 canh cua 1 tam giac");
					if (a == b && b == c) {
						System.out.println("la 1 tam giac deu");
					} else if (a == b && b != c) {
						System.out.println("la 1 tam giac can");
					} else if ((c == Math.sqrt(a * a + b * b) || b == Math.sqrt(a * a + c * c)
							|| a == Math.sqrt(b * b + c * c)) && (a == b && b != c)) {
						System.out.println("la 1 tam giac vuong can");
					} else if (c == Math.sqrt(a * a + b * b) || b == Math.sqrt(a * a + c * c)
							|| a == Math.sqrt(b * b + c * c)) {
						System.out.println("la 1 tam giac vuong");
					} else
						System.out.println("la 1 tam giac thuong");
					break;
				} else
					System.out.println("a, b, c khong phai la 3 canh cua 1 tam giac");
			} else
				System.out.println("Gia tri a khong hop le!\nNhap lai lan " + i + " : ");
		}
	}
}
