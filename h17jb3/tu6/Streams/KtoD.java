package h17jb3.tu6.Streams;
//ĐỌC GHI FILE DÙNG LUỒNG KÝ TỰ. Ví dụ: đọc những dòng văn bản nhập từ bàn phím và ghi chúng xuống file tên là “test.Txt”. Việc đọc và ghi kết thúc khi người dùng nhập vào chuỗi “stop”.

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KtoD {
	public static void main(String args[]) throws IOException {
		String str;
		FileWriter fw;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			fw = new FileWriter("/home/teo/Downloads/STUDY/JavaCore/src/h17jb3/tu6/Streams/KtoD.text");
		} catch (IOException exc) {
			System.out.println("Khong the mo file.");
			return;
		}
		System.out.println("Nhap ('stop' de ket thuc chuong trinh).");
		do {
			System.out.print(": ");
			str = br.readLine();
			if (str.compareTo("stop") == 0)
				break;
			str = str + "\r\n";
			fw.write(str);
		} while (str.compareTo("stop") != 0);
		fw.close();
	}
}
