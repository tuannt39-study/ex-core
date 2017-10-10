package vietjack.ex.j05methods;

//Cách sử dụng vòng lặp for và foreach để hiển thị các phần tử trong một Mảng (Array) trong Java?

import java.util.ArrayList;

public class J14ForeachLoop {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Tutorials");
		list.add("Point");
		list.add("India PVT Limited");
		for (String s : list) {
			System.out.println(s);
		}
	}
}
