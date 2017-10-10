package vietjack.ex.j10collections;

//Cách sử dụng Enumeration để hiển thị nội dung của HashTable trong Java?
//Ví dụ sau minh họa cách sử dụng các phương thức hasMoreElements và nestElement của lớp Enumeration để hiển thị nội dung của HashTable trong Java.

import java.util.Enumeration;
import java.util.Hashtable;

public class J12UseEnumDisplayHashTable {
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("1", "One");
		ht.put("2", "Two");
		ht.put("3", "Three");
		Enumeration<String> e = ht.elements();

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
