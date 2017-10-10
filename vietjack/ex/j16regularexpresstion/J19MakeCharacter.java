package vietjack.ex.j16regularexpresstion;

//Cách biến đổi chữ cái đầu tiên của mỗi từ thành chữ hoa trong Regex trong Java?

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J19MakeCharacter {
	public static void main(String[] args) {
		
		//Cách biến đổi chữ cái đầu tiên của mỗi từ trong một string thành chữ hoa bởi sử dụng phương thức toUpperCase(), appendTail() trong Java.
		String str = "this is a java test";
		System.out.println(str);
		StringBuffer stringbf = new StringBuffer();
		Matcher m = Pattern.compile("([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(str);

		while (m.find()) {
			m.appendReplacement(stringbf, m.group(1).toUpperCase() + m.group(2).toLowerCase());
		}
		System.out.println(m.appendTail(stringbf).toString());
	}
}
