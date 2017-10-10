package vietjack.tu99101.Col.HashMap;

//Lớp HashMap trong Java
//Lớp HashMap trong Java sử dụng một hashtable để triển khai Map Interface. Điều này cho phép thời gian thực thi các hoạt động cơ bản, như get() và put().

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class J01HashMapDemo {
	public static void main(String args[]) {

		// Tao mot hash map
		HashMap<String, Double> hm = new HashMap<String, Double>();
		// Dat cac phan tu vao map
		hm.put("Zara", new Double(3434.34));
		hm.put("Mahnaz", new Double(123.22));
		hm.put("Ayan", new Double(1378.00));
		hm.put("Daisy", new Double(99.22));
		hm.put("Qadir", new Double(-19.08));
		
		System.out.println(hm);

		System.out.println();
		
		//Sử dụng keySet()
		Set<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key + " = " + hm.get(key));
        }

		System.out.println("-------------------");

		System.out.println();
		
		//Sử dụng entrySet()
		Set<Entry<String, Double>> entries = hm.entrySet();
        for (Entry<?, ?> entry : entries) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

		System.out.println("-------------------");
		
		// Lay mot tap hop cac entry
		Set<?> set = hm.entrySet();
		// Lay mot iterator
		Iterator<?> i = set.iterator();
		// Hien thi cac phan tu
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();
		// Gui 1000 vao trong tai khoan cua Zara
		double balance = hm.get("Zara").doubleValue();
		hm.put("Zara", new Double(balance + 1000));
		System.out.println("Balance hien tai cua Zara la: " + hm.get("Zara"));

		System.out.println("-------------------");
		
	}
}
