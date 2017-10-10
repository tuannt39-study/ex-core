package vietjack.tu51.Oop.RegularExpression;

//Các phương thức replaceFirst và replaceAll trong Java

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J05Replace {
	private static String REGEX = "HaDong";
	private static String INPUT = "HaDong nam o mien nam. " + "HaDong la thanh pho cua BinhDuong.";
	private static String REPLACE = "BinhDuong";

	public static void main(String[] args) {
		Pattern p = Pattern.compile(REGEX);
		// lay mot doi tuong matcher
		Matcher m = p.matcher(INPUT);
		INPUT = m.replaceAll(REPLACE);
		System.out.println(INPUT);
	}
}
