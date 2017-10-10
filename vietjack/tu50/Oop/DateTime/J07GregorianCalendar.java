package vietjack.tu50.Oop.DateTime;

//Lớp GregorianCalendar trong Java

import java.util.Calendar;
import java.util.GregorianCalendar;

public class J07GregorianCalendar {
	public static void main(String args[]) {
		String months[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

		int year;
		// Tao mot Gregorian calendar duoc khoi tao
		// voi date va time hien tai trong
		// locale va timezone mac dinh.
		GregorianCalendar gcalendar = new GregorianCalendar();
		// Hien thi thon tin date va time hien tai.
		System.out.println("Ngày: ");
		System.out.print(months[gcalendar.get(Calendar.MONTH)]);
		System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
		System.out.println(year = gcalendar.get(Calendar.YEAR));
		System.out.println("Thời gian: ");
		System.out.print(gcalendar.get(Calendar.HOUR) + ":");
		System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
		System.out.println(gcalendar.get(Calendar.SECOND));

		// Kiem tra xem year hien tai co phai la leap year khong
		if (gcalendar.isLeapYear(year)) {
			System.out.println("Năm hiện tại là năm nhuận leap-year");
		} else {
			System.out.println("Năm hiện tại không phải năm nhuận leap-year");
		}
	}
}
