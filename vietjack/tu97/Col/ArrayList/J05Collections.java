package vietjack.tu97.Col.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class J05Collections {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(3);
		al.add(2);
		al.add(4);
		al.add(1);

		// Tìm kiếm nhị phân
		System.out.println(Collections.binarySearch(al, 4)); // 2

		// Hoán vị ngẫu nhiên
		Collections.shuffle(al);
		System.out.println(al); // [4, 1, 2, 3]

		// Hoán vị al[0] và al[2]
		Collections.swap(al, 0, 2);
		System.out.println(al); // [2, 1, 4, 3]

		// Đảo ngược
		Collections.reverse(al);
		System.out.println(al); // [3, 4, 1, 2]

		// Gán giá trị cho tất cả các phần tử
		Collections.fill(al, 69);
		System.out.println(al); // [69, 69, 69, 69]
	}
}
