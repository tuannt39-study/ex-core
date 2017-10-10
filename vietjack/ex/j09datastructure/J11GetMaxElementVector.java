package vietjack.ex.j09datastructure;

//Cách lấy phần tử lớn nhất từ một vector trong Java?
//Ví dụ sau minh họa cách lấy phần tử lớn nhất của một vector bởi sử dụng phương thức v.add() 
//của lớp Vector và phương thức Collections.max() của lớp Collection trong Java.

import java.util.Collections;
import java.util.Vector;

public class J11GetMaxElementVector {
	public static void main(String[] args) {
		Vector<Double> v = new Vector<Double>();
		v.add(new Double("3.4324"));
		v.add(new Double("3.3532"));
		v.add(new Double("3.342"));
		v.add(new Double("3.349"));
		v.add(new Double("2.3"));
		Object obj = Collections.max(v);
		System.out.println("The max element is:" + obj);
	}
}
