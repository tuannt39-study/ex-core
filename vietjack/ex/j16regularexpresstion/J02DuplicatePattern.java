package vietjack.ex.j16regularexpresstion;

//Cách so khớp các Duplicate word trong một Regular Expression trong Java?

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J02DuplicatePattern {
	public static void main(String args[]) throws Exception {
		
		//Cách tìm các Duplicate word trong một Regular Expression bởi sử dụng phương thức p.matcher() và m.group() của lớp regex.Matcher trong Java.
		String duplicatePattern = "\\b(\\w+) \\1\\b";
		Pattern p = Pattern.compile(duplicatePattern);
		int matches = 0;
		String phrase = " this is a test ";
		Matcher m = p.matcher(phrase);
		String val = null;
		while (m.find()) {
			val = ":" + m.group() + ":";
			matches++;
		}
		if (val != null)
			System.out.println("The string has matched with the pattern.");
		else
			System.out.println("The string has not matched with the pattern.");
	}
}
