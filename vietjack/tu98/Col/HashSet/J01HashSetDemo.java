package vietjack.tu98.Col.HashSet;

import java.util.ArrayList;
import java.util.Collections;

//Lớp HashSet trong Java
//Lớp HashSet trong Java kế thừa AbstractSet và triển khai Set Interface. Nó tạo một collection mà sử dụng một hash table để lưu giữ. Lưu ý trong hashset chỉ chứa các phần tử duy nhất, không chấp nhận 2 phần tử trùng nhau
//Một hash table lưu giữ thông tin bởi sử dụng một kỹ thuật được gọi là hashing. Trong hashing, nội dung mang tính thông tin của một key được sử dụng để quyết định một value duy nhất, được gọi là hash code của nó.
//Hash code sau đó được sử dụng như là index, tại đó dữ liệu mà liên kết với key được lưu giữ. Phép biến đổi của key vào trong hash code của nó được thực hiện tự động.

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class J01HashSetDemo {
	public static void main(String args[]) {
		// tao mot hash set
		Set<String> hs = new HashSet<String>();
		// them cac phan tu toi hash set
		hs.add("B");
		hs.add("A");
		hs.add("F");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		hs.add("D");
		// them gia tri F 2 lan nhung ket qua chi xuat hien 1 lan
		System.out.println(hs);
		
		System.out.println();
		
		Iterator<String> i = hs.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        
        System.out.println();
		
		for (String a : hs) {
            System.out.print(a + " ");
        }
		
		System.out.println();
		
		Set<Integer> hs2 = new HashSet<>();
        hs2.add(3);
        hs2.add(2);
        hs2.add(2);
        hs2.add(1);
        
        System.out.println(hs2);
        
        // Cách 1: Chuyển sang HashSet sang List
        List<Integer> al = new ArrayList<Integer>(hs2);
        Collections.sort(al);
        System.out.println(al); // [1, 2, 3]
        
        // Cách 2: Chuyển sang HashSet sang TreeSet
        TreeSet<Integer> ts = new TreeSet<Integer>(hs2);
        System.out.println(ts); // [1, 2, 3]
		
		
	}
}
