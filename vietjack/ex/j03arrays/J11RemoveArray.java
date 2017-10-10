package vietjack.ex.j03arrays;

//Cách xóa một mảng từ Mảng (Array) khác trong Java?

import java.util.ArrayList;

public class J11RemoveArray {
	public static void main(String[] args) {
		ArrayList<String> objArray = new ArrayList<String>();
		ArrayList<String> objArray2 = new ArrayList<String>();
		objArray2.add(0, "common1");
		objArray2.add(1, "common2");
		objArray2.add(2, "notcommon");
		objArray2.add(3, "notcommon1");
		objArray.add(0, "common1");
		objArray.add(1, "common2");
		objArray.add(2, "notcommon2");
		System.out.println("Array elements of array1: \n" + objArray);
		System.out.println("Array elements of array2: \n" + objArray2);
		
		//Phương thức Removeall để xóa một mảng từ Mảng (Array) khác trong Java.
		objArray.removeAll(objArray2);
		System.out.println("Array1 after removing array2 from array1: \n" + objArray);
	}
}
