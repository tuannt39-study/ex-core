package h17jb3.tu2.Compressed;
//Vòng lặp while

public class TestWhile {
	public static void main(String[] args) {
		int tong = 0, i = 1;
		while (i <= 100) {
			tong += i;
			i += 2;
		}
		System.out.println(tong);
	}

}
