package vietjack.ex.j16regularexpresstion;

//Cách chia một Regular Expression trong Java?

import java.util.regex.Pattern;

public class J13SplitRegular {
	public static void main(String args[]) {
		
		//Cách chia một Regular Expression bởi sử dụng phương thức Pattern.compile() và patternname.split() của lớp regex.Pattern trong Java.
		Pattern p = Pattern.compile(" ");
		String tmp = "this is the Java example";
		String[] tokens = p.split(tmp);

		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	}
}
