package vietjack.tu93.Col.MapInterface;

//Map Interface trong Java
//Map Interface trong Java so khớp duy nhất các key với value. Một key là một đối tượng mà bạn sử dụng để thu nhận một value.
//Với một key và value đã cung cấp, bạn có thể lưu giữ value trong một đối tượng Map. Sauk hi giá trị được lưu, bạn có thể thu nhận nó bởi sử dụng key của nó.
//Một số phương thức ném một NoSuchElementException khi không có item nào tồn tại trong Map đang gọi.
//Một ClassCastException được ném khi một đối tượng là không tương thích với các phần tử trong một Map.
//Một NullPointerException được ném nếu cố gắng sử dụng một đối tượng null và null là không được cho phép trong Map.
//Một UnsupportedOperationException được ném khi cố gắng thay đổi một Unmodifiable Map trong Java.
//Map có sự triển khai trong các lớp đa dạng của nó giống như HashMap

import java.util.HashMap;
import java.util.Map;

public class J01MapInterfaceDemo {
	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("Zara", "8");
		m1.put("Mahnaz", "31");
		m1.put("Ayan", "12");
		m1.put("Daisy", "14");
		System.out.println();
		System.out.println(" Cac phan tu cua Map");
		System.out.print("\t" + m1);
	}
}
