package vietjack.ex.j02strings;

//Cách thay thế một chuỗi phụ bên trong một String bằng chuỗi phụ khác trong Java?

public class J04StringReplaceEmp {
	public static void main(String args[]) {
		String str = "Hello World";
		
		//Trả về một chuỗi mới kết quả từ việc thay thế tất cả 'H' trong chuỗi này bằng 'W'
		System.out.println(str.replace('H', 'W'));
		
		//Thay thế chuỗi phụ đầu tiên của chuỗi này mà so khớp với regular expression đã cho với chuỗi thay thế đã cho
		System.out.println(str.replaceFirst("He", "Wa"));
		
		//Thay thế mỗi chuỗi phụ trong chuỗi này mà so khớp với regular expression với chuỗi thay thế đã cho
		System.out.println(str.replaceAll("He", "Ha"));
	}
}
