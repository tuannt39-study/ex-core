package vietjack.ex.j04datetime;

//Cách hiển thị Date trong định dạng khác nhau trong Java?

import java.text.DateFormat;
import java.util.Date;

public class J14FormatDate {
	public static void main(String[] args) {

		// Hiển thị tên ngày trong tuần trong định dạng viết tắt bởi sử dụng phương thức DateFormatSymbols().getWeekdays() của lớp DateFormatSymbols trong Java.
		Date dt = new Date();

		DateFormat[] dtformat = new DateFormat[6];
		dtformat[0] = DateFormat.getInstance();
		dtformat[1] = DateFormat.getDateInstance();
		dtformat[2] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dtformat[3] = DateFormat.getDateInstance(DateFormat.FULL);
		dtformat[4] = DateFormat.getDateInstance(DateFormat.LONG);
		dtformat[5] = DateFormat.getDateInstance(DateFormat.SHORT);

		for (DateFormat dateform : dtformat)
			System.out.println(dateform.format(dt));
	}
}
