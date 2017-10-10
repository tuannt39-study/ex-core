package vietjack.ex.j04datetime;

//Cách hiển thị tháng trong định dạng viết tắt trong Java?

import java.text.DateFormatSymbols;

public class J08MonthShortFormat {
	public static void main(String[] args) {
		String[] shortMonths = new DateFormatSymbols().getShortMonths();
		
		//Định dạng viết tắt bởi sử dụng phương thức DateFormatSymbols().getShortMonths() của lớp DateFormatSymbols trong Java.
		for (int i = 0; i < (shortMonths.length - 1); i++) {
			String shortMonth = shortMonths[i];
			System.out.println("shortMonth = " + shortMonth);
		}
		
		String[] months = new DateFormatSymbols().getMonths();
		for (String month: months) {
			System.out.println("Month = " + month);
		}
	}
}
