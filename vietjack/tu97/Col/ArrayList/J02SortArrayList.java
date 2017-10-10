package vietjack.tu97.Col.ArrayList;

//Đối với List của các kiểu dữ liệu có thể so sánh trực tiếp được luôn như Wrapper Class và String, ta sẽ dùng luôn phương thức sort(List) của lớp tiện ích java.util.Collections để sắp xếp

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class J02SortArrayList {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(3);
		al.add(2);
		al.add(4);
		al.add(1);
		
		System.out.println(al);

		// Sắp xếp theo chiều tăng dần
		Collections.sort(al);
		System.out.println(al); // [1 2 3 4]

		// Sắp xếp theo chiều giảm dần
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al); // [4 3 2 1]
	}
}
