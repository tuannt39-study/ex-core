package vietjack.tu50.Oop.DateTime;

//Định dạng Date sử dụng printf trong Java

import java.util.Date;

public class J03DatePrintf {
	public static void main(String args[]) {
		// khoi tao mot doi tuong Date
		Date date = new Date();

		// Hien thi date va time boi su dung toString()
		String str = String.format("Thời gian hiện tại: \n%tc", date);

		System.out.printf(str);
		System.out.println();
		System.out.printf("%1$s %2$tB %2$td, %2$tY", "Thời gian:\n", date);
		System.out.println();
		System.out.printf("%s %tB %<te, %<tY", "Thời gian là:\n", date);
	}
}
