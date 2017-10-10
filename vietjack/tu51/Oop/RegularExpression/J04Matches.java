package vietjack.tu51.Oop.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Các phương thức matches và lookingAt trong Java

public class J04Matches {
	private static final String REGEX = "it";
	private static final String INPUT = "itttttttttttttgaphot";
	private static Pattern pattern;
	private static Matcher matcher;

	public static void main(String args[]) {
		pattern = Pattern.compile(REGEX);
		matcher = pattern.matcher(INPUT);

		System.out.println("REGEX hien tai la: " + REGEX);
		System.out.println("INPUT hien tai la: " + INPUT);

		System.out.println("lookingAt(): " + matcher.lookingAt());
		System.out.println("matches(): " + matcher.matches());
	}
}
