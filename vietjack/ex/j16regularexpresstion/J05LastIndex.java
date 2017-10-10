package vietjack.ex.j16regularexpresstion;

//Cách biết chỉ mục cuối của một từ cụ thể trong một string trong Java?

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J05LastIndex {
	public static void main(String args[]) {

		// Cách biết chỉ mục cuối của một từ cụ thể trong một string bởi sử dụng phương thức Pattern.compile() của lớp Pattern
		// Và phương thức matcher.find() của lớp Matcher trong Java.
		String candidateString = "This is a Java example. This is another Java example.";
		Pattern p = Pattern.compile("Java");
		Matcher matcher = p.matcher(candidateString);
		matcher.find();
		int nextIndex = matcher.end();
		System.out.print("The last index of Java is:");
		System.out.println(nextIndex);
	}
}
