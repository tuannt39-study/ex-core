package vietjack.ex.j04datetime;

//Cách hiển thị time trong định dạng các quốc gia khác nhau trong Java?

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class J11CountryFormat {
	public static void main(String[] args) throws Exception {

		// Sử dụng lớp Locale và DateFormat trong Java để hiển thị date trong định dạng của các quốc gia khác nhau.
		Date d1 = new Date();
		System.out.println("today is: \n" + d1.toString());

		System.out.println();
		
		Locale locItalian = new Locale("ch");
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locItalian);
		System.out.println("today is in Switzerland Format: \n" + df.format(d1));

		System.out.println();
		
		Locale locItalian2 = new Locale("it");
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locItalian2);
		System.out.println("today is in Italian Format: \n" + df2.format(d1));

		System.out.println();
		
		Locale locItalian3 = new Locale("vi");
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, locItalian3);
		System.out.println("today is in Vietnam Format: \n" + df3.format(d1));
	}
}
