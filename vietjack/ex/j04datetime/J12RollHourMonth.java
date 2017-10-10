package vietjack.ex.j04datetime;

//Cách roll giờ và tháng trong Java?

import java.util.Calendar;
import java.util.Date;

public class J12RollHourMonth {
	public static void main(String[] args) throws Exception {
		Date d1 = new Date();
		Calendar cl = Calendar.getInstance();
		cl.setTime(d1);
		System.out.println("today is: \n" + d1.toString());
		
		System.out.println();
		
		//Roll qua các tháng (năm không thay đổi) hoặc giờ (tháng và năm không thay đổi) bởi sử dụng phương thức roll() của lớp Calendar trong Java.
		cl.roll(Calendar.MONTH, 1);
		System.out.println("date after a month will be: \n" + cl.getTime().toString());
		
		System.out.println();
		
		cl.roll(Calendar.HOUR, 7);
		System.out.println("date after 7 hrs will be: \n" + cl.getTime().toString());
	}
}
