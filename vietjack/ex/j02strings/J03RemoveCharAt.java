package vietjack.ex.j02strings;

//Cách xóa một ký tự cụ thể từ một String trong Java?

public class J03RemoveCharAt {
	public static void main(String args[]) {
		String str = "this is Java";
		
		//str.substring(0, 3) - Chuỗi phụ bắt đầu với ký tự tại chỉ mục đã xác định (0) và kéo dài tới (2)
		//str.substring(4) - Chuỗi phụ bắt đầu với ký tự tại chỉ mục đã xác định (4) và kéo dài tới cuối chuỗi
		String st = str.substring(0, 3) + str.substring(4);
		System.out.println(st);
	}
}
