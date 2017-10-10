package vietjack.ex.j16regularexpresstion;

//Cách Validate định dạng địa chỉ Email trong Regex trong Java?

public class J16ValidateEmail {
	public static void main(String[] args) {
		
		//Cách Validate định dạng địa chỉ Email trong Regex bởi sử dụng phương thức matches() của lớp String trong Java.
		String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		String email1 = "user@domain.com";
		Boolean b = email1.matches(EMAIL_REGEX);
		System.out.println("is e-mail: " + email1 + "\nValid = " + b);
		String email2 = "user^domain.co.in";
		b = email2.matches(EMAIL_REGEX);
		System.out.println("is e-mail: " + email2 + "\nValid = " + b);
	}
}
