package h17jb3.tu2.Compressed;
//Nhập dữ liệu số

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class inputNum {
	public static void main(String[] args) {
		int n = 0;
		System.out.print("Nhập: ");
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String s;
			s = in.readLine();
			n = Integer.parseInt(s);
		} catch (Exception e) {
			System.out.println("Nhập dữ liệu bị lỗi !");
		}
		System.out.println("Bạn vừa nhập số: " + n);
	}
}
