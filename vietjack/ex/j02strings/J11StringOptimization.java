package vietjack.ex.j02strings;

//Cách tối ưu hóa việc tạo String trong Java?

public class J11StringOptimization {
	public static void main(String[] args) {
		String variables[] = new String[9999999];
		for (int i = 0; i < 9999999; i++) {
			variables[i] = "s" + i;
		}
		
		//Thời gian bắt đầu
		long startTime0 = System.currentTimeMillis();
		for (int i = 0; i < 9999999; i++) {
			variables[i] = "hello";
		}
		
		//Thời gian kết thúc
		long endTime0 = System.currentTimeMillis();
		
		//Đo lường thời gian đã trôi qua trong Java
		System.out.println("Creation time" + " of String literals : " + (endTime0 - startTime0) + " ms");
		
		long startTime1 = System.currentTimeMillis();
		for (int i = 0; i < 9999999; i++) {
			variables[i] = new String("hello");
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("Creation time of" + " String objects with 'new' key word : " + (endTime1 - startTime1) + " ms");
		
		long startTime2 = System.currentTimeMillis();
		for (int i = 0; i < 9999999; i++) {
			variables[i] = new String("hello");
			variables[i] = variables[i].intern();
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("Creation time of" + " String objects with intern(): " + (endTime2 - startTime2) + " ms");
	}
}
