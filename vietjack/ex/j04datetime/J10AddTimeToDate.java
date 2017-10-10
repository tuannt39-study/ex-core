package vietjack.ex.j04datetime;

//Cách thêm time (ngày, năm, giây) tới Date trong Java?

import java.util.Calendar;
import java.util.Date;

public class J10AddTimeToDate {
	public static void main(String[] args) throws Exception {
		
		//Thêm time tới một date bởi sử dụng phương thức add() của Calendar trong Java.
		Date d1 = new Date();
		Calendar cl = Calendar.getInstance();
		cl.setTime(d1);
		System.out.println("today is: \n" + d1.toString());
		cl.add(Calendar.MONTH, 1);
		System.out.println("date after a month will be: \n" + cl.getTime().toString());
		cl.add(Calendar.HOUR, 7);
		System.out.println("date after 7 hrs will be: \n" + cl.getTime().toString());
		cl.add(Calendar.YEAR, 3);
		System.out.println("date after 3 years will be: \n" + cl.getTime().toString());
	}
}
