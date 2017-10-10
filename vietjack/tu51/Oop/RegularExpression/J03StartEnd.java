package vietjack.tu51.Oop.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Các phương thức start và end trong Java

public class J03StartEnd {
	private static final String REGEX = "\\bplay\\b";
	private static final String INPUT = "play play play football tennis play";

	public static void main(String args[]) {
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT); // Lay mot doi tuong matcher
		int count = 0;

		while (m.find()) {
			count++;
			System.out.println("So ket noi " + count);
			System.out.println("start(): " + m.start());
			System.out.println("end(): " + m.end());
		}
	}
}
