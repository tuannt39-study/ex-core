package vietjack.tu50.Oop.DateTime;

//Nhận Date và Time hiện tại trong Java

import java.util.Date;

public class J01DateDemo {
	public static void main(String args[]) {
		// khoi tao mot doi tuong Date
		Date date = new Date();

		// hien thi date va time boi su dung toString()
		System.out.println(date.toString());
		System.out.println(date.getTime());
		System.out.println(date.hashCode());
	}
}
