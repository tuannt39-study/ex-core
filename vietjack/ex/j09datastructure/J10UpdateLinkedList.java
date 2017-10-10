package vietjack.ex.j09datastructure;

//Cách update một Linked List trong Java ?
//Ví dụ sau minh họa cách update một Linked List bởi sử dụng phương thức listname.add() 
//và listname.set() của lớp LinkedList trong Java.

import java.util.LinkedList;

public class J10UpdateLinkedList {
	public static void main(String[] a) {
		LinkedList<String> officers = new LinkedList<String>();
		officers.add("B");
		officers.add("B");
		officers.add("T");
		officers.add("H");
		officers.add("P");
		System.out.println(officers);
		officers.set(2, "M");
		System.out.println(officers);
	}
}
