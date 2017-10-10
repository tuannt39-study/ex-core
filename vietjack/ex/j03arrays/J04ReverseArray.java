package vietjack.ex.j03arrays;

import java.util.ArrayList;
import java.util.Collections;

//Cách đảo ngược một danh sách Mảng (Array) trong Java?

public class J04ReverseArray {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		System.out.println("Before Reverse Order: " + arrayList);
		
		//Đảo ngược một danh sách Mảng (Array) bởi sử dụng phương thức Collections.reverse(ArrayList) trong Java.
		Collections.reverse(arrayList);
		System.out.println("After Reverse Order: " + arrayList);
	}
}
