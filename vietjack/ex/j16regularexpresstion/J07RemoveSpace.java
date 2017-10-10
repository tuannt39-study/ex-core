package vietjack.ex.j16regularexpresstion;

//Cách xóa các khoảng trống trắng trong Java?

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J07RemoveSpace {
	public static void main(String[] argv) {

		// Cách xóa các khoảng trống trắng bởi sử dụng phương thức
		// matcher.replaceAll(stringname) của lớp Util.regex.Pattern trong Java.
		String str = "This is a Java program. This is another Java Program.";
		String pattern = "[\\s]";
		String replace = "";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		str = m.replaceAll(replace);
		System.out.println(str);
	}
}
