package h17jb3.tu2.Compressed;
//Ví dụ nhập một số nguyên và một số thực, nhập dữ liệu từ bàn phím

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestInput {
	public static void main(String[] args) throws Exception {
		BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Nhap mot so nguyen:");
		
		String siNumber = inStream.readLine();
		int iNumber = Integer.parseInt(siNumber);
		System.out.print("Nhap mot so thuc:");
		
		String sfNumber = inStream.readLine();
		float fNumber = Float.parseFloat(sfNumber);
		System.out.println("So nguyen: " + iNumber);
		System.out.println("So thuc: " + fNumber);
	}
}
