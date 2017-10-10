package vietjack.ex.j04datetime;

//Cách định dạng time trong định dạng AM-PM trong Java?

import java.text.SimpleDateFormat;
import java.util.Date;

public class J01FormatAMPM {
	public static void main(String[] args) {
		Date date = new Date();
		String strDateFormat = "HH:mm:ss a";
		
		//SimpleDateFormat là một lớp cố định (cụ thể) để định dạng và parse các date theo một phương thức nhạy cảm với locale.
		//SimpleDateFormat cho phép bạn bắt đầu bởi việc họn bất kỳ pattern đã được định nghĩa bởi người dùng cho định dạng date-time.	
		SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
		System.out.println(date);
		System.out.println(sdf.format(date));
	}
}
