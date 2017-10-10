package h17jb3.tu6.Streams;
//NHẬP CONSOLE DÙNG LUỒNG KÝ TỰ. Ví dụ: dùng bufferedreader đọc từng ký tự từ console. Việc đọc kết thúc khi gặp dấu chấm (dấu chấm để kết thúc chương trình).

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadChars {
	public static void main(String args[]) throws IOException {
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nhap chuoi ky tu, gioi han dau cham.");
		// read characters
		do {
			c = (char) br.read();
			System.out.print(c);
		} while (c != '.');
	}
}
