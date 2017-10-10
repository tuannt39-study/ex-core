package thantrieu.ex1;

//Giải và biện luận phương trình bậc nhất ax+b=0
import java.util.Scanner;

public class B08 {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			System.out.println("Nhap a = ");
			a = sc.nextInt();
			System.out.println("Nhap b = ");
			b = sc.nextInt();
			if (a > 0) {
				System.out.println("Phuong trinh bac nhat: \n" + a + "x + " + b + " = 0");
				System.out.println("Co nghiem la:\nx = " + (float) (-b) / a);
				break;
			} else
				System.out.println("Gia tri a, b khong hop le!\nNhap lai a, b lan " + i + " : ");
		}
	}
}
