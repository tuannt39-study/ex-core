package vietjack.ex.j10collections;

//Cách đảo ngược một Collection trong Java ?
//Ví dụ sau minh họa cách đảo ngược một Collection 
//bởi sử dụng phương thức listIterator() và Collection.reverse() của lớp Collection và Listiterator trong Java.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class J07ReverseCollection {
	public static void main(String[] args) {
		String[] coins = { "A", "B", "C", "D", "E" };
		List<String> l = new ArrayList<String>();
		for (int i = 0; i < coins.length; i++)
			l.add(coins[i]);
		ListIterator<String> liter = l.listIterator();
		System.out.println("Before reversal");
		while (liter.hasNext())
			System.out.println(liter.next());
		Collections.reverse(l);
		liter = l.listIterator();
		System.out.println("After reversal");
		while (liter.hasNext())
			System.out.println(liter.next());
	}
}
