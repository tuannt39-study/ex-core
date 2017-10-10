package h17jb3.tu3.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList lkl = new LinkedList();
		
		lkl.addFirst(1);
		lkl.addFirst(2);
		lkl.add("3");
		lkl.addLast("Lasst");
		
		lkl.push("Chao");
		
		//lkl.clear();
		
		Object o = lkl.pollLast();
		Object o2 = lkl.get(2);
		
		System.out.println("0 - : " + o.toString());
		
		System.out.println("Vi tri cua 3: " + lkl.indexOf(o2));
		
		for (Object obj: lkl) {
			System.out.println("pt: " + obj);
		}
	}
}
