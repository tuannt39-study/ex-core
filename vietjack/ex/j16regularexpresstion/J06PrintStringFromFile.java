package vietjack.ex.j16regularexpresstion;

//Cách in tất cả string mà so khớp với một pattern cụ thể từ một file trong Java?

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J06PrintStringFromFile {
	public static void main(String[] args) throws IOException {

		// Cách in tất cả string mà so khớp với một pattern cụ thể từ một file với sự
		// giúp đỡ của phương thức Patternname.matcher() của lớp Util.regex trong Java.
		Pattern p1 = Pattern.compile("[A-Za-z][a-z]+");
		BufferedReader r = new BufferedReader(new FileReader("/home/teo/Downloads/hello.java"));
		String line;

		while ((line = r.readLine()) != null) {
			Matcher m = p1.matcher(line);
			while (m.find()) {
				System.out.println(m.group(0));
				int s1 = m.start(0);
				int e1 = m.end(0);
				System.out.println(line.substring(s1, e1));
			}
		}
	}
}
