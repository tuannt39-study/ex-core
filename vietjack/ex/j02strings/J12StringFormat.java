package vietjack.ex.j02strings;

//Cách định dạng các String trong Java?

import java.util.Locale;

public class J12StringFormat {
	public static void main(String[] args) {
		double e = Math.E;
		
		//Trả về một giá trị String đã được định dạng bởi sử dụng Locale
		//Định dạng và các tham số cụ thể trong phương thức format() trong Java.
		System.out.format("%f%n", e);
		System.out.format(Locale.GERMANY, "%-10.4f%n%n", e);
	}
}
