package vietjack.ex.j16regularexpresstion;

//Cách so khớp phone number trong một list trong Java?

public class J10MatchPhoneNumber {
	private static boolean isValid(String s) {
		String regex = "\\d{2}-\\d{4}-\\d{6}";
		return s.matches(regex);
	}

	public static void main(String[] args) {
		System.out.println(isValid("91-9652-018244"));
	}
}
