package vietjack.ex.j16regularexpresstion;

//Cách thay thế sự có mặt đầu tiên của String trong Regex trong Java?

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J14ReplaceFirst {
	public static void main(String args[]) {
		
		//Cách thay thế sự có mặt đầu tiên của String trong Regex bởi sử dụng phương thức replaceFirst() của lớp Matcher trong Java.
		Pattern p = Pattern.compile("hello");
		String instring = "hello hello hello.";
		System.out.println("initial String: \n" + instring);
		Matcher m = p.matcher(instring);
		String tmp = m.replaceFirst("Java");
		System.out.println("String after replacing 1st Match: \n" + tmp);
	}
}
