package h17jb3.tu6.Streams;
//XUẤT CONSOLE DÙNG LUỒNG KÝ TỰ. VÍ DỤ: MINH HỌA DÙNG PRINTWRITER ĐỂ XUẤT DỮ LIỆU RA CONSOLE

import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String args[]) {
		PrintWriter pw = new PrintWriter(System.out, true);
		int i = 10;
		double d = 123.67;
		double r = i+d;
		pw.println("Using a PrintWriter.");
		pw.println(i);
		pw.println(d);
		pw.println(i + " + " + d + " = " + r);
	}
}
