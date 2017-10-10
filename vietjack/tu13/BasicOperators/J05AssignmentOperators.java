package vietjack.tu13.BasicOperators;
//Ví dụ toán tử gán trong Java

public class J05AssignmentOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 0;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

		//Toán tử gán đơn giản. Gán giá trị toán hạng bên phải cho toán hạng trái.	
		c = a + b;
		System.out.println("c = a + b = " + c);

		//Thêm giá trị toán hạng phải tới toán hạng trái và gán giá trị đó cho toán hạng trái.	
		c += a;
		System.out.println("c += a  = " + c);

		//Trừ đi giá trị toán hạng phải từ toán hạng trái và gán giá trị này cho toán hạng trái.	
		c -= a;
		System.out.println("c -= a = " + c);

		//Nhân giá trị toán hạng phải với toán hạng trái và gán giá trị này cho toán hạng trái.	
		c *= a;
		System.out.println("c *= a = " + c);

		//Chia toán hạng trái cho toán hạng phải và gán giá trị này cho toán hạng trái.	
		a = 10;
		c = 15;
		c /= a;
		System.out.println("c /= a = " + c);
		//Lấy phần dư của phép chia toán hạng trái cho toán hạng phải và gán cho toán hạng trái.	
		a = 10;
		c = 15;
		c %= a;
		System.out.println("c %= a  = " + c);

		//Dịch trái toán hạng trái sang số vị trí là giá trị toán hạng phải.	
		c <<= 2;
		System.out.println("c <<= 2 = " + c);

		//Dịch phải toán hạng trái sang số vị trí là giá trị toán hạng phải.	
		c >>= 2;
		System.out.println("c >>= 2 = " + c);

		//Phép AND bit	
		c &= a;
		System.out.println("c &= 2  = " + c);

		//Phép OR loại trừ bit	
		c ^= a;
		System.out.println("c ^= a   = " + c);

		//Phép OR bit.	
		c |= a;
		System.out.println("c |= a   = " + c);
	}

}
