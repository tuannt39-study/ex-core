package vietjack.ex.j09datastructure;

//Cách thực thi tìm kiếm nhị phân (Binary Search) trên một vector trong Java?
//Ví dụ sau minh họa cách thực thi tìm kiếm nhị phân (Binary Search) trên một vector
//bởi sử dụng phương thức v.add() của lớp Vector và phương thức sort.Collection() của lớp Collection trong Java.

import java.util.Collections;
import java.util.Vector;

public class J12BinarySearchVector {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("X");
		v.add("M");
		v.add("D");
		v.add("A");
		v.add("O");
		Collections.sort(v);
		System.out.println(v);
		int index = Collections.binarySearch(v, "D");
		System.out.println("Element found at : " + index);
	}
}
