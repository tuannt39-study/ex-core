package vietjack.ex.j02strings;

//Cách tìm kiếm vị trí cuối cùng của Chuỗi phụ trong Java?

public class J02SearchLastString {
	public static void main(String[] args) {
		String strOrig = "Hello world ,Hello Reader";
		
		//Trả về chỉ mục trong chuỗi này với sự xuất hiện cuối cùng của chuỗi phụ đã cho
		//Giá trị index bắt đầu chuỗi phụ lần cuối.
		int lastIndex = strOrig.lastIndexOf("Hello");
		if (lastIndex == -1) {
			System.out.println("Hello not found");
		} else {
			System.out.println("Last occurrence of Hello is at index " + lastIndex);
		}
	}
}
