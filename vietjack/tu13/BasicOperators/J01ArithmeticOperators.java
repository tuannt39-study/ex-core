package vietjack.tu13.BasicOperators;
//Ví dụ toán tử số học trong Java

public class J01ArithmeticOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 25;
		int d = 25;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);

		// Phép cộng
		System.out.println("a + b = " + (a + b));
		
		// Phép trừ: trừ toán hạng trái cho toán hạng phải
		System.out.println("a - b = " + (a - b));
		
		// Phép nhân
		System.out.println("a * b = " + (a * b));
		
		// Phép chia: chia toán hạng trái cho toán hạng phải
		System.out.println("b / a = " + (b / a));
		
		// Phép chia lấy phần dư: Lấy phần dư của phép chia toán hạng trái cho toán hạng phải
		System.out.println("b % a = " + (b % a));
		System.out.println("c % a = " + (c % a));
		
		// Phép lượng gia: lượng gia giá trị toán hạng thêm 1
		System.out.println("a++   = " + (a++));
		
		// Phép lượng giảm: lượng giảm giá trị toán hạng đi 1
		System.out.println("b--   = " + (a--));

		// Kiem tra su khac nhau giua d++ va ++d
		System.out.println("d = " + d);
		System.out.println("d++   = " + (d++));
		System.out.println("d = " + d);
		System.out.println("++d   = " + (++d));
		System.out.println("d = " + d);
	}

}
