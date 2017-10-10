package vietjack.ex.j16regularexpresstion;

//Cách thay thế tất cả sự có mặt của String trong Regex trong Java?

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J18ReplaceAll {
	public static void main(String args[]) {
		
		//Cách thay thế tất cả sự có mặt của String bởi sử dụng phương thức replaceAll() của lớp Matcher trong Java.
		Pattern p = Pattern.compile("hello");
		String instring = "hello hello hello.";
		System.out.println("initial String: \n" + instring);
		Matcher m = p.matcher(instring);
		String tmp = m.replaceAll("Java");
		System.out.println("String after replacing 1st Match: \n" + tmp);
	}
}
