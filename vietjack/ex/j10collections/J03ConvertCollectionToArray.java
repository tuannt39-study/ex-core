package vietjack.ex.j10collections;

//Cách biến đổi một Collection thành một Array trong Java?
//Ví dụ sau minh họa cách biến đổi một Collection thành một Array bởi sử dụng phương thức list.add() và list.toArray() trong Java.

import java.util.ArrayList;
import java.util.List;

public class J03ConvertCollectionToArray {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("This ");
		list.add("is ");
		list.add("a ");
		list.add("good ");
		list.add("program.");
		String[] s1 = list.toArray(new String[0]);
		for (int i = 0; i < s1.length; ++i) {
			String contents = s1[i];
			System.out.print(contents);
		}
	}
}
