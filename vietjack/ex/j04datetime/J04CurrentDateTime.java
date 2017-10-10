package vietjack.ex.j04datetime;

//Cách hiển thị date và time hiện tại trong Java?

import java.util.Calendar;
import java.util.Formatter;

public class J04CurrentDateTime {
	public static void main(String args[]) {
		Formatter fmt = new Formatter();
		Calendar cal = Calendar.getInstance();
		
		//Phương thức Calendar.getInstance() của lớp Calendar trong Java.
		//Phương thức fmt.format() của lớp Formatter trong Java.
		fmt.format("%tc", cal);
		System.out.println(fmt);
	}
}
