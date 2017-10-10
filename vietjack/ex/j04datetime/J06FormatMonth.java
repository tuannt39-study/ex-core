package vietjack.ex.j04datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

//Cách định dạng tháng trong Java?

public class J06FormatMonth {
	public static void main(String[] args) {
		Date date = new Date();

		// Định dạng tháng bởi sử dụng SimpleDateFormat('MMMM') constructor và phương
		// thức sdf.format(date) của lớp SimpleDateFormat trong Java.
		SimpleDateFormat sdf = new SimpleDateFormat("M");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM");
		SimpleDateFormat sdf3 = new SimpleDateFormat("MMM");
		SimpleDateFormat sdf4 = new SimpleDateFormat("MMMM");
		System.out.println("Current Month in MMMM format : \n" + sdf.format(date) + "\n" + sdf2.format(date) + "\n" + sdf3.format(date) + "\n" + sdf4.format(date));
	}
}
