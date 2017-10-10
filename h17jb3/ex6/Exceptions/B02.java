package h17jb3.ex6.Exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Loi extends Exception {
	Loi(String s) {
		super(s);
	}
}

public class B02 {
	private static int x;
	static void phepChia(int b) throws Loi {
		if (b==0)
			throw new Loi("So bi chia = 0");
		else
			System.out.println("Thuc hien phep chia");
	}
	
	static void nhapSo(String s) throws Loi {
		int n=0;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			s = in.readLine();
			n = Integer.parseInt(s);
			x=n;
			System.out.println("Nhap so thanh cong = " + n);
		} catch (Exception e) {
			x=n;
			System.out.println("Nhap so khong thanh cong = " + n);
		}
	}

	public static void main(String args[]) {
		int a1, b1;
		String a = null, b = null;
		try {
			System.out.print("Nhap a: ");
			nhapSo(a);
			a1=x;
			System.out.print("Nhap b: ");
			nhapSo(b);
			b1=x;
			try {
				phepChia(b1);
				double c=(double)a1/b1;
				System.out.println("c = " + c);
			} catch (Exception e) {
				System.out.println("Ket qua loi: " + e);
			}
		} catch (Exception e) {
			System.out.println("Nhap so loi: " + e);
		}
	}
	
}
