package vietjack.ex.j04datetime;

//Cách tìm một tuần của năm trong Java?

import java.util.Calendar;

public class J13FindWeek {
	public static void main(String[] args) throws Exception {
//		Date d1 = new Date();
//		Calendar cl = Calendar.getInstance();
//		cl.setTime(d1);

		// Hiển thị số tuần của năm hoặc tháng trong Java.
		System.out.println("today is a \n" + Calendar.WEEK_OF_YEAR + " week of the year \n");
		System.out.println();
		System.out.println("today is a \n" + Calendar.DAY_OF_MONTH + " month of the year \n");
		System.out.println();
		System.out.println("today is a \n" + Calendar.WEEK_OF_MONTH + " week of the month \n");
	}
}
