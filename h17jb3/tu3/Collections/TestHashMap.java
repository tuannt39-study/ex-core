package h17jb3.tu3.Collections;
///Ví dụ về HashMap

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestHashMap {
	public static void main(String[] args) {
		HashMap hMap = new HashMap();
		hMap.put("K1", "Hi");
		hMap.put("K2", "He");
		hMap.put("K3", "Ha");
		hMap.put("K4", "Ho");
		
		System.out.println("HashMap content: ");
		Set keySet = hMap.keySet();
		for (Iterator i = keySet.iterator(); i.hasNext();) {
			Object key = i.next();
			System.out.println(key + " - " + hMap.get(key));
		}
	}

}
