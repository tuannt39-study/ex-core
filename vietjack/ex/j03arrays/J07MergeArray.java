package vietjack.ex.j03arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Cách sáp nhập các Mảng (Array) trong Java?

public class J07MergeArray {
	public static void main(String args[]) {
		String a[] = { "A", "E", "I" };
		String b[] = { "O", "U" };
		
		//Nhập hai Mảng (Array) thành một Mảng (Array) đơn bởi sử dụng phương thức list.Addall(array1.asList(array2) của lớp List
		//Và phương thức Arrays.toString() của lớp Array trong Java
		List<String> list = new ArrayList<String>(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		Object[] c = list.toArray();
		System.out.println(Arrays.toString(c));
	}
}
