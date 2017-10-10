package vietjack.ex.j10collections;

//Cách shuffle (xáo trộn) các phần tử của một Collection trong Java?
//Ví dụ sau minh họa cách shuffle (xáo trộn) các phần tử của một Collection bởi sử dụng phương thức Collections.shuffle() của lớp Collection trong Java.

import java.util.ArrayList;
import java.util.Collections;

public class J08ShuffleElement {
	public static void main(String[] argv) throws Exception {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("A");
		obj.add("E");
		obj.add("I");
		obj.add("O");
		obj.add("U");
		Collections.shuffle(obj);
		System.out.println(obj);
	}
}
