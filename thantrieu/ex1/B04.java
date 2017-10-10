package thantrieu.ex1;

//Nhập vào hai số nguyên a, b. So sánh xem số nào lớn hơn, số nào nhỏ hơn hay hai số bằng nhau. In kết quả ra màn hình.
import java.util.Scanner;

public class B04 {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập a = ");
		a = sc.nextInt();
		System.out.println("Nhập b = ");
		b = sc.nextInt();
		if (a == b) {
			System.out.println("Hai số bằng nhau ");
		} else if (a > b) {
			System.out.println("Số a lớn hơn số b: \n" + a + " > " + b);
		} else
			System.out.println("Số a nhỏ hơn số b: \n" + a + " < " + b);
	}
}
