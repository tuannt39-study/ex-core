package vietjack.ex.j04datetime;

//Cách hiển thị tên tháng trong định dạng MMM trong Java?

import java.util.Calendar;
import java.util.Formatter;

public class J02Month {
	public static void main(String args[]) {
		Formatter fmt = new Formatter();
		Calendar cal = Calendar.getInstance();
		
		//Phương thức Calender.getInstance() của lớp Calender
		//Phương thức fmt.format() của lớp Formatter trong Java.
		fmt.format("%tB %tb %tm", cal, cal, cal);
		System.out.println(fmt);
	}
}
