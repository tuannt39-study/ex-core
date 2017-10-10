package vietjack.ex.j02strings;

//Cách tối ưu hóa việc nối chuỗi trong Java?

public class J13StringConcatenate {
	public static void main(String[] args) {
		
		//Thời gian bắt đầu
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 9999999; i++) {
			String result = "This is" + "testing the" + "difference" + "between" + "String" + "and" + "StringBuffer";
		}
		
		//Thời gian kết thúc
		long endTime = System.currentTimeMillis();
		
		//Đo lường thời gian đã trôi qua trong Java
		System.out.println("Time taken for string" + "concatenation using + operator : " + (endTime - startTime) + " ms");
		
		long startTime1 = System.currentTimeMillis();
		for (int i = 0; i < 9999999; i++) {
			StringBuffer result = new StringBuffer();
			
			//Phương thức append() của lớp StringBuffer trong Java được sử dụng để nối chuỗi tham số đã cho với chuỗi này
			result.append("This is");
			result.append("testing the");
			result.append("difference");
			result.append("between");
			result.append("String");
			result.append("and");
			result.append("StringBuffer");
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("Time taken for String concatenation" + "using StringBuffer : " + (endTime1 - startTime1) + " ms");
	}
}
