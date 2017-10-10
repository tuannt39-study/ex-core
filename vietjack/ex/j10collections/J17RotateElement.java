package vietjack.ex.j10collections;

//Cách rotate các phần tử của List trong Java?
//Ví dụ sau minh họa cách sử dụng phương thức rotate() để rotate các phần tử của List 
//phụ thuộc vào tham số thứ 2 của phương thức đó trong Java.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class J17RotateElement {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("one Two three Four five six".split(" "));
		System.out.println("List :" + list);
		Collections.rotate(list, 3);
		System.out.println("rotate: " + list);
	}
}
