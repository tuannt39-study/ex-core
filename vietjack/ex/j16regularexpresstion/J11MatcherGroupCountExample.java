package vietjack.ex.j16regularexpresstion;

//Cách đếm nhóm các từ trong một string trong Java?

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J11MatcherGroupCountExample {
	public static void main(String args[]) {

		// Cách đếm nhóm các từ trong một string bởi sử dụng phương thức
		// matcher.groupCount() của lớp regex.Matcher trong Java.
		Pattern p = Pattern.compile("J(ava)");
		String candidateString = "This is Java. This is a Java example.";
		Matcher matcher = p.matcher(candidateString);
		int numberOfGroups = matcher.groupCount();
		System.out.println("numberOfGroups =" + numberOfGroups);
	}
}
