package h17jb3.tu3.Collections;
//Ví dụ “TreeMap"

import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		TreeMap treeMap = new TreeMap();
		treeMap.put("101", "Hi");
		treeMap.put("102", "He");
		treeMap.put("103", "Ha");
		treeMap.put("104", "Ho");

		// Get first element
		Object fkey = treeMap.firstKey();
		System.out.println("First element: " + treeMap.get(fkey));

		// Get last element
		Object lkey = treeMap.lastKey();
		System.out.println("Last element: " + treeMap.get(lkey));

		System.out.println("Elements before key 103");
		SortedMap smap = treeMap.headMap("103");
		Set hMapKeys = smap.keySet();

		for (Iterator i = hMapKeys.iterator(); i.hasNext();) {
			Object key = (Object) i.next();
			System.out.println(smap.get(key));
		}

	}

}
