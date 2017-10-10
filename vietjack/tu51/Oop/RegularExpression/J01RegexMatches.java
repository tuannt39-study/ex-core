package vietjack.tu51.Oop.RegularExpression;

//Capture các Group trong Java
//Ví dụ sau minh họa cách để tìm một chuỗi chữ số từ chuỗi chữ-số đã cho:

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J01RegexMatches {
	public static void main(String args[]) {

		// String de duoc quet de tim pattern.
		String line = "Vietjack xin chao cac ban. Day la vi du ve Regex! 1000  0USD";
		String pattern = "(.*)(\\d+)(.*)";

		// Tao mot doi tuong Pattern
		Pattern r = Pattern.compile(pattern);
		
		// Tao doi tuong matcher.
		Matcher m = r.matcher(line);
		
		if (m.find()) {
			System.out.println("Gia tri duoc tim thay la: \n" + m.group(0));
			System.out.println("Gia tri duoc tim thay la: \n" + m.group(1));
			System.out.println("Gia tri duoc tim thay la: \n" + m.group(2));
		} else {
			System.out.println("Khong co ket noi");
		}
	}
}
