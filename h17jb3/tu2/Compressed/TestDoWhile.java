package h17jb3.tu2.Compressed;
//Vòng lặp do/while

public class TestDoWhile {
	public static void main(String[] args) {
		int tong = 0, i = 1;
		do {
			tong += i;
			i += 2;
		} while (i <= 100);
		System.out.println(tong);
	}
}
