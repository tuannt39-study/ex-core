package vietjack.ex.j04datetime;

//Cách định dạng time trong định dạng 24h trong Java?

import java.text.SimpleDateFormat;
import java.util.Date;

public class J05FormatTime24h {
	public static void main(String[] args) {
		Date date = new Date();
		
		//Định dạng time trong định dạng 24h (00:00-24:00) bởi sử dụng phương thức sdf.format(date) của lớp SimpleDateFormat trong Java.
		SimpleDateFormat sdf = new SimpleDateFormat("H");
		System.out.println("hour in 24h format : \n" + sdf.format(date));
	}
}
