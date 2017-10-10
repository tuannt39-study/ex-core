package thantrieu.ex1;

//Hãy nhập 4 số thực a, b, c, d. Tìm giá trị lớn nhất của chúng và gán giá trị lớn nhất đó cho biến max. In giá trị max tìm được ra màn hình. Trong trường hợp 4 số bằng nhau thì in ra: không có số lớn nhất.
import java.util.Scanner;

public class B05 {
	public static void main(String[] args) {
		float a, b, c, d, max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập a:");
		a = sc.nextFloat();
		System.out.println("Nhập b:");
		b = sc.nextFloat();
		System.out.println("Nhập c:");
		c = sc.nextFloat();
		System.out.println("Nhập d:");
		d = sc.nextFloat();
		max = a;
		if (b > max) {
			max = b;
		} else {
			max = max;
		}
		if (c > max) {
			max = c;
		} else {
			max = max;
		}
		if (d > max) {
			max = d;
		} else {
			max = max;
		}
		if (a == b && c == d && a == max) {
			System.out.println("Không có số lớn nhất");
		} else {
			System.out.println("Max = " + max);
		}
	}
}
