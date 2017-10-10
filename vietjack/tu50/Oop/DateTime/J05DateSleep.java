package vietjack.tu50.Oop.DateTime;

//Đình chỉ trong chốc lát (sleep for a while) trong Java

import java.util.Date;

public class J05DateSleep {
	public static void main(String args[]) {
		try {
			System.out.println(new Date() + "\n");
			Thread.sleep(5 * 60 * 10);
			System.out.println(new Date() + "\n");
		} catch (Exception e) {
			System.out.println("Lỗi!");
		}
	}
}
