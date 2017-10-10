package vietjack.ex.j09datastructure;

//Cách tìm một phần tử bên trong một Linked List trong Java ?
//Ví dụ sau minh họa cách tìm một phần tử bên trong một Linked List
//bởi sử dụng linkedlistname.indexof(element) để lấy vị trí đầu tiên của phần tử
//và linkedlistname.Lastindexof(elementname) để lấy vị trí cuối cùng của phần tử bên trong một Linked List trong Java.

import java.util.LinkedList;

public class J07SearchElementLinkedList {
	public static void main(String[] args) {
		LinkedList<String> lList = new LinkedList<String>();
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");
		lList.add("2");
		System.out.println("First index of 2 is:" + lList.indexOf("2"));
		System.out.println("Last index of 2 is:" + lList.lastIndexOf("2"));
	}
}
