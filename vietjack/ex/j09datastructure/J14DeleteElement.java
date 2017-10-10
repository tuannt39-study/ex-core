package vietjack.ex.j09datastructure;

//Cách xóa các phần tử khỏi một LinkedList trong Java ?
//Ví dụ sau minh họa cách xóa nhiều phần tử khỏi LinkedList bởi sử dụng phương thức Clear() trong Java.

import java.util.LinkedList;

public class J14DeleteElement {
	public static void main(String[] args) {
		LinkedList<String> lList = new LinkedList<String>();
		lList.add("1");
		lList.add("8");
		lList.add("6");
		lList.add("4");
		lList.add("5");
		System.out.println(lList);
		lList.subList(2, 4).clear();
		System.out.println(lList);
	}
}
