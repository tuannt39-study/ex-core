package vietjack.tu99102.Col.TreeMap;

//Lớp TreeMap trong Java
//Lớp TreeMap trong Java triển khai Map Interface bởi sử dụng một tree. Một TreeMap cung cấp các phương thức hiệu quả để lưu giữ các cặp key/value trong thứ tự được sắp xếp, và cho phép thu hồi nhanh chóng.
//Bạn nên chú ý rằng, không giống một hash map, một tree map bảo đảm rằng các phần tử của nó sẽ được xếp thứ tự theo thứ tự key tăng dần.

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class J01TreeMapDemo {
	public static void main(String args[]) {
		// Tao mot hash map
		TreeMap<String, Double> tm = new TreeMap<String, Double>();
		// Dat cac phan tu vao map
		tm.put("Zara", new Double(3434.34));
		tm.put("Mahnaz", new Double(123.22));
		tm.put("Ayan", new Double(1378.00));
		tm.put("Daisy", new Double(99.22));
		tm.put("Qadir", new Double(-19.08));

		System.out.println(tm);

		System.out.println();
		
		// Lay mot tap hop cac entry
		Set<?> set = tm.entrySet();
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
		double balance = tm.get("Zara").doubleValue();
		tm.put("Zara", new Double(balance + 1000));
		System.out.println("Balance hien tai cua Zara la: " + tm.get("Zara"));
	}
}
