package vietjack.ex.j16regularexpresstion;

//Cách kiểm tra định dạng Date trong Regex có chính xác hay không trong Java?

public class J15CheckFormat {
	public static void main(String[] argv) {
		
		//Cách kiểm tra định dạng Date trong Regex có chính xác hay không bởi sử dụng phương thức matches của lớp String trong Java.
		boolean isDate = false;
		String date1 = "8-05-1988";
		String date2 = "08/04/1987";
		String datePattern = "\\d{1,2}-\\d{1,2}-\\d{4}";

		isDate = date1.matches(datePattern);
		System.out.println("Date :" + date1 + "\nmatches with the this date Pattern:" + datePattern + "\nAns:" + isDate);

		isDate = date2.matches(datePattern);
		System.out.println("Date :" + date2 + "\nmatches with the this date Pattern:" + datePattern + "\nAns:" + isDate);
	}
}
