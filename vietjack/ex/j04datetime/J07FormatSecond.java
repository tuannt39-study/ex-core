package vietjack.ex.j04datetime;

//Cách định dạng giây trong Java?

import java.text.SimpleDateFormat;
import java.util.Date;

public class J07FormatSecond {
	public static void main(String[] args) {
		Date date = new Date();
		
		//Định dạng giây bởi sử dụng SimpleDateFormat('ss') constructor và phương thức sdf.format(date) của lớp SimpleDateFormat trong Java.
		SimpleDateFormat sdf = new SimpleDateFormat("s");
		System.out.println("seconds in ss format : \n" + sdf.format(date));
	}
}
