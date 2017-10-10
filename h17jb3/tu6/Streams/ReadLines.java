package h17jb3.tu6.Streams;
//NHẬP CONSOLE DÙNG LUỒNG KÝ TỰ. Ví dụ: dùng bufferedreader đọc chuỗi ký tự từ console. Chương trình kết thúc khi gặp chuỗi đọc là chuỗi “stop”

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLines {
	public static void main(String args[]) throws IOException {
		// create a BufferedReader using System.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Nhap chuoi.");
		System.out.println("Nhap 'stop' ket thuc chuong trinh.");
		do {
			str = br.readLine();
			System.out.println(str);
		} while (!str.equals("stop"));
	}
}
