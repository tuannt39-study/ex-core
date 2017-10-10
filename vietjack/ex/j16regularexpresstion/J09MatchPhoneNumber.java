package vietjack.ex.j16regularexpresstion;

//Cách so khớp phone number trong một list trong Java?

public class J09MatchPhoneNumber {
	public static void main(String args[]) {

		// Cách so khớp phone number trong một list tới một pattern cụ thể bởi sử dụng
		// phương thức phone.matches(phoneNumberPattern) trong Java.
		isPhoneValid("1-999-585-4009");
		isPhoneValid("999-585-4009");
		isPhoneValid("1-585-4009");
		isPhoneValid("585-4009");
		isPhoneValid("1.999-585-4009");
		isPhoneValid("999 585-4009");
		isPhoneValid("1 585 4009");
		isPhoneValid("111-Java2s");
	}

	public static boolean isPhoneValid(String phone) {
		boolean retval = false;
		String phoneNumberPattern = "(\\d-)?(\\d{3}-)?\\d{3}-\\d{4}";
		retval = phone.matches(phoneNumberPattern);
		String msg = "NO MATCH: pattern:" + phone + "\r\n regex: " + phoneNumberPattern;

		if (retval) {
			msg = " MATCH: pattern:" + phone + "\r\n regex: " + phoneNumberPattern;
		}
		System.out.println(msg + "\r\n");
		return retval;
	}
}
