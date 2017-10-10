package vietjack.ex.j04datetime;

//Cách hiển thị giờ và phút hiện tại trong Java?

import java.util.Calendar;
import java.util.Formatter;

public class J03HourMinute {
	public static void main(String args[]) {
		Formatter fmt = new Formatter();
		Calendar cal = Calendar.getInstance();
		
		//Phương thức Calendar.getInstance() của lớp Calendar trong Java.
		//Phương thức fmt.format() của lớp Formatter trong Java.
		fmt.format("%tl:%tM", cal, cal);
		System.out.println(fmt);
	}
}
