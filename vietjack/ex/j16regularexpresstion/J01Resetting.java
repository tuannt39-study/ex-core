package vietjack.ex.j16regularexpresstion;

//Cách phục hồi pattern của một Regular Expression trong Java?

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J01Resetting {
	public static void main(String[] args) throws Exception {
		
		//Cách phục hồi pattern của một Regular Expression bởi sử dụng phương thức Pattern.compile() của lớp Pattern và phương thức m.find() của lớp Matcher trong Java.
		Matcher m = Pattern.compile("[frb][aiu][gx]").matcher("fix the rug with bags");
		while (m.find())
			System.out.println(m.group());
		m.reset("fix the rig with rags");
		while (m.find())
			System.out.println(m.group());
	}
}
