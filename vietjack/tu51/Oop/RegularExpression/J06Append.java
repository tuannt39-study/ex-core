package vietjack.tu51.Oop.RegularExpression;

//Các phương thức appendReplacement và appendTail trong Java

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J06Append {
	private static String REGEX = "a*b";
	private static String INPUT = "aabfooaabfooabfoob";
	private static String REPLACE = "-";

	public static void main(String[] args) {
		Pattern p = Pattern.compile(REGEX);
		// lay mot doi tuong matcher
		Matcher m = p.matcher(INPUT);
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			m.appendReplacement(sb, REPLACE);
		}
		m.appendTail(sb);
		System.out.println(sb.toString());
	}
}
