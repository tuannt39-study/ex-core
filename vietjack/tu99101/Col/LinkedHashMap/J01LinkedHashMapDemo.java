package vietjack.tu99101.Col.LinkedHashMap;

//Lớp LinkedHashMap trong Java

import java.util.LinkedHashMap;
import java.util.Map;

public class J01LinkedHashMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> m = new LinkedHashMap<>();

		m.put(3, "Three");
		m.put(2, "Two");
		m.put(null, "Null");
		m.put(4, "Four");
		m.put(1, "One");
		System.out.println(m); // {3=Three, 2=Two, null=Null, 4=Four, 1=One}

	}
}
