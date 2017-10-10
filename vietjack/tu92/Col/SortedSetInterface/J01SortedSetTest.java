package vietjack.tu92.Col.SortedSetInterface;

//SortedSet Interface trong Java
//SortedSet Interface trong Java kế thừa Set và khai báo các hành vi của một Set được xếp thứ tự tăng dần
//SortedSet Interface trong Java có sự triển khai trong các lớp đa dạng như TreeSet

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class J01SortedSetTest {
	public static void main(String[] args) {

		// Tap sortedset
		SortedSet<String> set = new TreeSet<String>();

		// Them phan tu vao set
		set.add("b");
		set.add("c");
		set.add("a");

		// Lap qua cac phan tu trong set
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			// Lay phan tu
			Object element = it.next();
			System.out.println(element.toString());
		}
	}
}
