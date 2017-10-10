package vietjack.tu86.Data.Hashtable;

//Lớp Hashtable trong Java
//Giống như HashMap, lớp Hashtable lưu giữ các cặp key/value trong một hash table.
//Khi sử dụng một Hashtable, bạn xác định một đối tượng mà được sử dụng như là một key, và value mà bạn muốn liên kết tới key đó.
//Key này sau đó được hash, và hash code kết quả được sử dụng như là chỉ mục, tại đó value được lưu giữ bên trong table đó.

import java.util.Enumeration;
import java.util.Hashtable;

public class J01HashTableDemo {
	public static void main(String args[]) {
		// tao mot hash map
		Hashtable<String, Double> balance = new Hashtable<String, Double>();
		Enumeration<String> names;
		String str;
		double bal;

		balance.put("Zara", new Double(3434.34));
		balance.put("Mahnaz", new Double(123.22));
		balance.put("Ayan", new Double(1378.00));
		balance.put("Daisy", new Double(99.22));
		balance.put("Qadir", new Double(-19.08));

		// Hien thi tat ca balance trong hash table.
		names = balance.keys();
		while (names.hasMoreElements()) {
			str = (String) names.nextElement();
			System.out.println(str + ": " + balance.get(str));
		}
		System.out.println();
		// Gui 1,000 vao tai khoan cua Zara
		bal = ((Double) balance.get("Zara")).doubleValue();
		balance.put("Zara", new Double(bal + 1000));
		System.out.println("Balance moi cua Zara la: " + balance.get("Zara"));
	}
}
