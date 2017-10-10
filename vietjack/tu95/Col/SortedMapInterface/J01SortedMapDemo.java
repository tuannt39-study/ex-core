package vietjack.tu95.Col.SortedMapInterface;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//SortedMap Interface trong Java
//SortedMap Interface trong Java kế thừa lớp Map. Nó bảo đảm rằng các entry được duy trì theo thứ tự key tăng dần.
//Một số phương thức ném NoSuchElementException khi không có item nào trong map đang gọi. Một ClassCastException được ném khi một đối tượng là không tương thích với các phần tử trong một map. Một NullPointerException bị ném nếu cố gắng sử dụng một đối tượng null khi null không được phép trong map.
//SortedMap Interface trong Java có sự triển khai trong các lớp đa dạng tương tự như TreeMap

public class J01SortedMapDemo {
	public static void main(String args[]) {
		// Tao mot hash map
		TreeMap<String, Double> tm = new TreeMap<String, Double>();
		// Dat cac phan tu vao trong map
		tm.put("Zara", new Double(3434.34));
		tm.put("Mahnaz", new Double(123.22));
		tm.put("Ayan", new Double(1378.00));
		tm.put("Daisy", new Double(99.22));
		tm.put("Qadir", new Double(-19.08));

		// Lay mot set cac entry
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
