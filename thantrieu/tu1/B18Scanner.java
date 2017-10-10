package thantrieu.tu1;

import java.util.Scanner;

public class B18Scanner {
	public static void main(String[] args) {
		int a, b;
		float f;
		double d;
		char ch;
		byte byt;
		short sht;
		String str1;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.println("a = " + a);
		b = sc.nextInt();
		System.out.println("b = " + b);
		f = sc.nextFloat();
		System.out.println("f = " + f);
		d = sc.nextDouble();
		System.out.println("d = " + d);
		ch = sc.next().charAt(0);
		System.out.println("ch = " + ch);
		byt = sc.nextByte();
		System.out.println("byt = " + byt);
		sht = sc.nextShort();
		System.out.println("sht = " + sht);
		str1 = sc.next();
		System.out.println("str1 = " + str1);
		sc.nextLine(); // Đọc bỏ bộ đệm
		str1 = sc.nextLine(); // Đọc cả dòng
		System.out.println("str1 = " + str1);
	}
}
