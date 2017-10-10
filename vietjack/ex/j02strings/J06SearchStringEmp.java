package vietjack.ex.j02strings;

//Cách tìm một từ bên trong một String trong Java?

public class J06SearchStringEmp {
	public static void main(String[] args) {
		String strOrig = "Hello readers";
		
		//Trả về index của vị trí bắt đầu từ đó bên trong một String nếu được tìm thấy.
		//Nếu không thì nó trả về -1.
		int intIndex = strOrig.indexOf("read");
		if (intIndex == -1) {
			System.out.println("Hello not found");
		} else {
			System.out.println("Found Hello at index " + intIndex);
		}
	}
}
