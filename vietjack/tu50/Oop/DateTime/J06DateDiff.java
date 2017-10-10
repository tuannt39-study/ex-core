package vietjack.tu50.Oop.DateTime;

//Đo lường thời gian đã trôi qua trong Java

import java.util.Date;

public class J06DateDiff {
	public static void main(String args[]) {
		try {
			long start = System.currentTimeMillis();
			System.out.println(new Date() + "\n");
			Thread.sleep(5 * 60 * 10);
			System.out.println(new Date() + "\n");
			long end = System.currentTimeMillis();
			long diff = end - start;
			System.out.println("Khác nhau là : " + diff);
		} catch (Exception e) {
			System.out.println("Lỗi!");
		}
	}
}
