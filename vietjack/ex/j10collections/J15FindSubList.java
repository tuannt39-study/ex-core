package vietjack.ex.j10collections;

//Cách tìm một sublist trong một List trong Java?
//Ví dụ sau minh họa cách sử dụng phương thức indexOfSubList() để kiểm tra 
//trong list này có một sublist không và lastIndexOfSubList() 
//để tìm vị trí xuất hiện sublist cuối cùng trong list đã cho.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class J15FindSubList {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("one Two three Four five six one three Four".split(" "));
		System.out.println("List :" + list);

		List<String> sublist = Arrays.asList("three Four".split(" "));
		System.out.println("SubList :" + sublist);
		System.out.println("indexOfSubList: " + Collections.indexOfSubList(list, sublist));

		System.out.println("lastIndexOfSubList: " + Collections.lastIndexOfSubList(list, sublist));
	}
}
