package vietjack.ex.j02strings;

//Cách so sánh thời gian tạo String trong Java?

public class J10StringComparePerformance {
	public static void main(String[] args) {
		
		//Thời gian bắt đầu
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 9999999; i++) {
			String s1 = "hello";
			String s2 = "hello";
		}
		//Thời gian kết thúc
		long endTime = System.currentTimeMillis();
		
		//Đo lường thời gian đã trôi qua trong Java
		System.out.println("Time taken for creation" + " of String literals : " + (endTime - startTime) + " milli seconds");
		
		long startTime1 = System.currentTimeMillis();
		for (int i = 0; i < 9999999; i++) {
			String s3 = new String("hello");
			String s4 = new String("hello");
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("Time taken for creation" + " of String objects : " + (endTime1 - startTime1) + " milli seconds");
	}
}
