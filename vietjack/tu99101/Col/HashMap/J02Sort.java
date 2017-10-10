package vietjack.tu99101.Col.HashMap;

//Sắp xếp HashMap và LinkedHashMap
//
//Do TreeMap sắp xếp theo chiều tăng dần của key nên ta sẽ chuyển HashMap và LinkedHashMap về TreeMap.

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class J02Sort {
	public static void main(String[] args) {
		Map<String, Integer> unsorted = new HashMap<>();
		unsorted.put("A", 1);
		unsorted.put("D", 2);
		unsorted.put("XX", 3);
		unsorted.put("AAA", 4);
		System.out.println(unsorted); // {XX=3, A=1, AAA=4, D=2}

		Map<String, Integer> sorted = new TreeMap<>(unsorted);
		System.out.println(sorted); // {A=1, AAA=4, D=2, XX=3}

		// Sử dụng interface Comparator
		// Bây giờ thay vì sắp xếp tăng dần, ta sẽ sắp xếp giảm dần:
		System.out.println("-------------------------");

//		Map<String, Integer> sorted2 = new TreeMap<>(new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return o2.compareTo(o1);
//			}
//		});

		sorted.putAll(unsorted);
		System.out.println(sorted); // {XX=3, D=2, AAA=4, A=1}
	}
}
