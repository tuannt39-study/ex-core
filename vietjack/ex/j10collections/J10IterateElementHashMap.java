package vietjack.ex.j10collections;

//Cách duyệt qua các phần tử của HashMap trong Java?
//Ví dụ sau minh họa cách sử dụng phương thức iterator của lớp Collection để duyệt qua HashMap trong Java.

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class J10IterateElementHashMap {
	public static void main(String[] args) {
		HashMap<String, String> hMap = new HashMap<String, String>();
		hMap.put("1", "1st");
		hMap.put("2", "2nd");
		hMap.put("3", "3rd");
		Collection<String> cl = hMap.values();
		Iterator<String> itr = cl.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
