package vietjack.ex.j10collections;

//Cách thay thế phần tử trong List trong Java?
//Ví dụ sau minh họa cách sử dụng phương thức replaceAll() 
//để thay thế tất cả sự có mặt của một phần tử với phần tử khác trong một List trong Java.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class J16ReplaceElement {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("one Two three Four five six one three Four".split(" "));
		System.out.println("List :" + list);
		Collections.replaceAll(list, "one", "hundread");
		System.out.println("replaceAll: " + list);
	}
}
