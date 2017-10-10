package vietjack.ex.j03arrays;

//Cách tìm một đối tượng hoặc một String trong Mảng (Array) trong Java?

import java.util.ArrayList;

public class J13FindObject {

	public static void main(String[] args) {
		ArrayList<String> objArray = new ArrayList<String>();
		ArrayList<String> objArray2 = new ArrayList<String>();
		ArrayList<String> objArray3 = new ArrayList<String>();
		objArray2.add(0, "common1");
		objArray2.add(1, "common2");
		objArray2.add(2, "notcommon");
		objArray2.add(3, "notcommon1");
		objArray.add(0, "common1");
		objArray.add(1, "common2");
		objArray3=objArray;
		System.out.println("Array elements of array1: \n" + objArray);
		System.out.println("Array elements of array2: \n" + objArray2);
		System.out.println("Array elements of array3: \n" + objArray3);
		
		System.out.println();
		
		//Trả về true nếu list này chứa phần tử đã cho. Chính thức hơn, trả về true nếu và chỉ nếu list này chứa ít nhất một phần tử e như (o==null ? e==null : o.equals(e))
		System.out.println("Array 1 contains String common2 ??: \n" + objArray.contains("common1"));
		System.out.println("Array 2 contains Array1 ??: \n" + objArray2.contains(objArray));
		System.out.println("Array 3 contains Array1 ??: \n" + objArray3.contains(objArray));
	}
}
