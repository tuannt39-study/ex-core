package vietjack.ex.j16regularexpresstion;

//Cách tìm một từ cụ thể trong một string trong Java?

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J12SearchParticular {
	public static void main(String args[]) {
		
		//Cách tìm một từ cụ thể trong một string bởi sử dụng phương thức matcher.start() của lớp regex.Matcher trong Java.
		String s1 = "sairamkrishna mammahe Tutorials Point Pvt Ltd";
		String regex = "\\bPoint\\b";
		Pattern p1 = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher m1 = p1.matcher(s1);

		while (m1.find()) {
			System.out.print("Start index: " + m1.start());
			System.out.print(" End index: " + m1.end() + " ");
			System.out.println(m1.group());
		}
	}
}
