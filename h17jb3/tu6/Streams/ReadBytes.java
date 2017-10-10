package h17jb3.tu6.Streams;
//ĐỌC DỮ LIỆU TỪ CONSOLE. Ví dụ sau đây minh họa cách dùng luồng byte thực hiện việc nhập xuất console. Chương trình minh họa việc đọc một mảng bytes từ system.In

import java.io.IOException;

public class ReadBytes {
	public static void main(String args[]) throws IOException {
		byte data[] = new byte[100];
		System.out.print("Enter some characters.");
		System.in.read(data);
		System.out.print("You entered: ");
		for (int i = 0; i < data.length; i++) {
			System.out.print((char) data[i]);
		}
	}
}
