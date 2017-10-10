package vietjack.tu99103.Col.CollectionAlgorithms;

//Thuật toán Collection trong Java
//Collection Framework định nghĩa một số thuật toán mà có thể áp dụng tới các Collection và Map.
//Những thuật toán này được định nghĩa như là các phương thức static bên trong lớp Collection. Một số phương thức có thể ném một ClassCastException, xảy ra khi cố gắng so sánh các kiểu không tương thích, hoặc ném một UnsupportedOperationException, xảy ra khi cố gắng sửa đổi một Unmodifiable Collection.

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class J01AlgorithmsDemo {
	public static void main(String args[]) {
		// Tao va khoi tao linked list
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(new Integer(-8));
		ll.add(new Integer(20));
		ll.add(new Integer(-20));
		ll.add(new Integer(8));

		// Ta mot comparator voi thu tu dao nguoc
		Comparator<Integer> r = Collections.reverseOrder();
		// Sap xep list boi su dung comparator
		Collections.sort(ll, r);
		// Lay iterator
		Iterator<Integer> li = ll.iterator();
		System.out.print("List duoc sap xep theo thu tu dao nguoc la: \n");
		while (li.hasNext()) {
			System.out.print(li.next() + " ");
		}
		System.out.println();
		Collections.shuffle(ll);
		// Hien thi danh sach sap xep ngau nhien
		li = ll.iterator();
		System.out.print("List sau khi bi xao tron la: \n");
		while (li.hasNext()) {
			System.out.print(li.next() + " ");
		}
		System.out.println();
		System.out.println("Minimum: " + Collections.min(ll));
		System.out.println("Maximum: " + Collections.max(ll));
	}
}
