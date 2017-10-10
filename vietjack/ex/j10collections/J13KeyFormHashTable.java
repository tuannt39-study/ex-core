package vietjack.ex.j10collections;

//Cách lấy bản liệt kê các Key từ HashTable trong Java?
//Ví dụ sau minh họa cách sử dụng phương thức key() để lấy bản liệt kê các Key từ HashTable trong Java.

import java.util.Enumeration;
import java.util.Hashtable;

public class J13KeyFormHashTable {
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("1", "One");
		ht.put("2", "Two");
		ht.put("3", "Three");
		Enumeration<String> e = ht.keys();

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
