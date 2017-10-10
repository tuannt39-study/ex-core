package vietjack.ex.j16regularexpresstion;

//Cách tìm mỗi sự xuất hiện của từ trong một Regular Expression trong Java?

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J04FindWord {
	public static void main(String args[]) throws Exception {
		
		//Cách tìm mỗi sự xuất hiện của từ trong một Regular Expression bởi sử dụng phương thức Pattern.compile() và m.group() trong Java.
		String candidate = "this is a test, A TEST.";
		String regex = "\\ba\\w*\\b";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(candidate);
		String val = null;
		System.out.println("INPUT: " + candidate);
		System.out.println("REGEX: " + regex + "\r\n");
		while (m.find()) {
			val = m.group();
			System.out.println("MATCH: " + val);
		}
		if (val == null) {
			System.out.println("NO MATCHES: ");
		}
	}
}
