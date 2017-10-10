package vietjack.ex.j10collections;

//Cách tìm min và max của một List trong Java?
//Ví dụ sau minh họa cách sử dụng phương thức min và max để tìm lớn nhất và nhỏ nhất trong List trong Java.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class J14FindMinMaxList {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("one Two three Four five six one three Four".split(" "));
		System.out.println(list);
		System.out.println("max: " + Collections.max(list));
		System.out.println("min: " + Collections.min(list));
	}
}
