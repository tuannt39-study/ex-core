package vietjack.ex.j02strings;

//Cách so khớp (match) các khu vực trong các String trong Java?

public class J09StringRegionMatch {
	public static void main(String[] args) {
		String first_str = "Welcome to Microsoft";
		String second_str = "I work with Microsoft";
		
		//Trả về true nếu khu vực phụ đã cho của chuỗi này so khớp với khu vực phụ đã xác định của tham số chuỗi; nếu không là false
		boolean match = first_str.regionMatches(11, second_str, 12, 9);
		System.out.println("first_str[11 -19] == " + "second_str[12 - 21]:-\n" + match);
	}
}
