package vietjack.tu50.Oop.DateTime;

//Parse các String vào trong các Date trong Java

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class J04SimpleDateFormat {
	public static void main(String args[]) {
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");

		String input = args.length == 0 ? "2017-11-25" : args[0];

		System.out.println(input + "\nChuyển thành dạng: ");

		Date t;

		try {
			t = ft.parse(input);
			System.out.println(t);
		} catch (ParseException e) {
			System.out.println("Không thể chuyển đổi: " + ft);
		}
	}
}
