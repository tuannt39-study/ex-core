package vietjack.ex.j02strings;

//Cách biến đổi cả một String thành chữ hoa trong Java?

public class J08StringToUpperCaseEmp {
	public static void main(String[] args) {
		String str = "string abc touppercase ";
		
		//Biến đổi tất cả ký tự trong String này thành kiểu chữ hoa bởi sử dụng các qui tắc của locale mặc định
		String strUpper = str.toUpperCase();
		System.out.println("Original String: " + str);
		System.out.println("String changed to upper case: " + strUpper);
	}
}
