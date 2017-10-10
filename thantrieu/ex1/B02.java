package thantrieu.ex1;

//Nhập vào một số nguyên n, kiểm tra xem số đó chẵn hay lẻ, âm hay dương, in kết quả kiểm tra ra màn hình.
import java.util.Scanner;

public class B02 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n = ");
		n = sc.nextInt();
		if (n > 0) {
			if (n % 2 == 0) {
				System.out.println("n là số dương, chẵn ");
			} else
				System.out.println("n là số dương, lẻ ");
		} else if (n < 0) {
			if (n % 2 == 0) {
				System.out.println("n là số âm, chẵn ");
			} else
				System.out.println("n là số âm, lẻ ");
		} else
			System.out.println("n=0");
	}
}
