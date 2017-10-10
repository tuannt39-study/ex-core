package vietjack.ex.j03arrays;

//Cách xóa một phần của Mảng (Array) trong Java?

import java.util.ArrayList;

public class J10RemoveElement {
	public static void main(String[] args) {
		ArrayList<String> objArray = new ArrayList<String>();
		
		//Gỡ bỏ tất cả phần tử từ list này
		objArray.clear();
		
		//Chèn phần tử đã cho tại index đã xác định trong list này.
		//Ném IndexOutOfBoundsException nếu index này ở bên ngoài dãy (index < 0 || index > size())
		objArray.add(0, "0th element");
		objArray.add(1, "1st element");
		objArray.add(2, "2nd element");
		System.out.println("Array before removing an element: \n" + objArray);
		
		//Gỡ bỏ phần tử tại index đã cho. Ném IndexOutOfBoundsException nếu index ở ngoài dãy (index < 0 || index >= size())
		objArray.remove(1);
		objArray.remove("0th element");
		System.out.println("Array after removing an element: \n" + objArray);
	}
}
