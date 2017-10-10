package vietjack.tu99100.Col.TreeSet;

import java.util.Iterator;

//Lớp TreeSet trong Java
//Lớp TreeSet trong Java cung cấp một sự triển khai của Set Interface mà sử dụng một tree cho lưu giữ. Các đối tượng được lưu giữ được xếp thứ tự tăng dần.
//Thời gian truy cập và thu nhận dữ liệu là khá nhanh, làm cho TreeSet như là một lựa chọn tuyệt vời khi lưu giữ một lượng lớn thông tin đã xếp thứ tự mà phải được tìm kiếm một cách nhanh chóng.

import java.util.TreeSet;

public class J01TreeSetDemo {
	public static void main(String args[]) {
		// Tao mot tree set
		TreeSet<String> ts = new TreeSet<String>();
		// them cac phan tu toi tree set
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		System.out.println(ts);
		
		System.out.println();
		
		Iterator<String> i = ts.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        
        System.out.println();
		
		for (String a : ts) {
            System.out.print(a + " ");
        }
		
		System.out.println();
        
	}
}
