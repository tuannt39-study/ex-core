package vietjack.ex.j10collections;

//Cách so sánh các phần tử trong một Collection trong Java?
//Ví dụ sau minh họa cách so sánh các phần tử trong một Collection 
//bằng việc biến đổi một String thành một TreeSet 
//bởi sử dụng phương thức Collection.min() và Collection.max() của lớp Collection trong Java.

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class J02CompareElement {
	public static void main(String[] args) {
		String[] coins = { "Penny", "nickel", "dime", "Quarter", "dollar" };
		Set<String> set = new TreeSet<String>();
		for (int i = 0; i < coins.length; i++) {
			set.add(coins[i]);
		}
		System.out.println(Collections.min(set));
		System.out.println(Collections.min(set, String.CASE_INSENSITIVE_ORDER));
		for (int i = 0; i <= 10; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println(Collections.max(set));
		System.out.println(Collections.max(set, String.CASE_INSENSITIVE_ORDER));
	}
}
