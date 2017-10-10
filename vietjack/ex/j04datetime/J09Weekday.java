package vietjack.ex.j04datetime;

//Cách hiển thị ngày trong tuần trong Java?

import java.text.DateFormatSymbols;

public class J09Weekday {
	public static void main(String[] args) {
		String[] weekdays = new DateFormatSymbols().getWeekdays();

		// Định dạng viết tắt bởi sử dụng phương thức DateFormatSymbols().getWeekdays() của lớp DateFormatSymbols trong Java.
		for (int i = 1; i < weekdays.length; i++) {
			String weekday = weekdays[i];
			System.out.println("weekday = " + weekday);
		}
	}
}
