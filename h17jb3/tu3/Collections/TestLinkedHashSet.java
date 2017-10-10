package h17jb3.tu3.Collections;
////Ví dụ LinkedHashSet

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("XYS");
		lhs.add("A");
		lhs.add("B");
		
		System.out.println("LinkedHashSet content: ");
		for (Iterator i = lhs.iterator(); i.hasNext(); ) {
			System.out.println(i.next());
		}
	}

}
