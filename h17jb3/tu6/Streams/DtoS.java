package h17jb3.tu6.Streams;
//ĐỌC GHI FILE DÙNG LUỒNG KÝ TỰ. Ví dụ: đọc và hiển thị nội dung của file “test.Txt” lên màn hình.

import java.io.BufferedReader;
import java.io.FileReader;

public class DtoS {
	public static void main(String args[]) throws Exception {
		FileReader fr = new FileReader("/home/teo/Downloads/STUDY/JavaCore/src/h17jb3/tu6/Streams/KtoD.text");
		BufferedReader br = new BufferedReader(fr);
		String s;
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}
		fr.close();
	}
}
