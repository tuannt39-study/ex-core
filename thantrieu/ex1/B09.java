package thantrieu.ex1;

//Giải và biện luận phương trình bậc 2:  ax2 + bx + c = 0
import java.util.Scanner;

public class B09 {
	public static void main(String[] args) {
		int a, b, c;
		float delta;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			System.out.println("Nhap a = ");
			a = sc.nextInt();
			System.out.println("Nhap b = ");
			b = sc.nextInt();
			System.out.println("Nhap c = ");
			c = sc.nextInt();
			if (a != 0) {
				System.out.println("Phuong trinh bac 2:\n" + a + "x2 + " + b + "x + " + c + " = 0");
				delta = (b * b - 4 * a * c);
				if (delta == 0) {
					System.out.println("Phuong trinh co nghiem duy nhat");
				} else if (delta > 0) {
					System.out.println("Phuong trinh co 2 nghiem phan biet");
				} else
					System.out.println("Phuong trinh vo nghiem");
				break;
			} else
				System.out.println("Gia tri a khong hop le!\nNhap lai lan " + i + " : ");
		}
	}
}
