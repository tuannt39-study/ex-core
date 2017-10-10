package vietjack.ex.j03arrays;

//Cách tìm các phần tử chung của các Mảng (Array) trong Java?

import java.util.ArrayList;

public class J12FindCommonElement {
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
		
		ArrayList<String> objArray3 = new ArrayList<String>();
		objArray3=objArray;
		
		System.out.println("Array elements of array1: \n" + objArray);
		System.out.println("Array elements of array2: \n" + objArray2);
		System.out.println("Array elements of array3: \n" + objArray3);
		objArray3.retainAll(objArray2);
		System.out.println("Array1 after retaining common elements of array2 & array3: \n" + objArray3);
	}
}
