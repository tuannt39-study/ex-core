package vietjack.ex.j09datastructure;

//Cách thêm phần tử vào vị trí đầu tiên và cuối cùng của một Linked List trong Java?
//Ví dụ sau minh họa cách thêm phần tử vào vị trí đầu tiên và cuối cùng của một Linked List
//bởi sử dụng phương thức addFirst() và addLast() của lớp LinkedList trong Java.

import java.util.LinkedList;

public class J03AddElementLinkedList {
	public static void main(String[] args) {
		LinkedList<String> lList = new LinkedList<String>();
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");
		System.out.println(lList);
		lList.addFirst("0");
		System.out.println(lList);
		lList.addLast("6");
		System.out.println(lList);
	}
}
