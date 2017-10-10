package h17jb3.tu3.Collections;
//Ví dụ HashSet

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("XYS");
		hs.add("A");
		hs.add("B");

		System.out.println("HashSet content: ");
		for (Iterator i = hs.iterator(); i.hasNext();) {
			System.out.println(i.next());
		}

	}

}
