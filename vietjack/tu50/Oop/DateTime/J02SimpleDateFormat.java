package vietjack.tu50.Oop.DateTime;

//Mã hóa định dạng SimpleDateFormat trong Java

import java.text.SimpleDateFormat;
import java.util.Date;

public class J02SimpleDateFormat {
	public static void main(String args[]) {
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz 'at' G HH:mm:ss");
		String tt = ft.format(dNow);
		System.out.println("Thời gian hiện tại: \n" + tt);
	}
}
