package vietjack.ex.j02strings;

//Cách so sánh hai String trong Java?

public class J01StringCompareEmp {
	public static void main(String args[]) {
		String str = "Hello World";
		String anotherString = "hello world";
		Object objStr = str;

		//So sánh hai chuỗi theo từ điển
		//Giá trị 0 nếu tham số là một chuỗi cân bằng với chuỗi này theo từ điển
		//một giá trị nhỏ hơn 0 nếu tham số là một chuỗi lớn hơn chuỗi này theo từ điển
		//một giá trị lớn hơn 0 nếu tham số là một chuỗi nhỏ hơn chuỗi này theo từ điển.
		System.out.println(str.compareTo(anotherString));
		
		//So sánh hai chuỗi theo từ điển, bỏ qua các sự khác nhau về kiểu chữ
		System.out.println(str.compareToIgnoreCase(anotherString));
		
		//So sánh String này với đối tượng Object khác
		System.out.println(str.compareTo(objStr.toString()));
	}
}
