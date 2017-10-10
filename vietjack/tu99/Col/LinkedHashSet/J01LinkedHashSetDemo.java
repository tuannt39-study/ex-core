package vietjack.tu99.Col.LinkedHashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

//Lớp LinkedHashSet trong Java
//Lớp LinkedHashSet trong Java kế thừa HashSet.
//Lớp LinkedHashSet duy trì một linked list của các entry trong Set, theo thứ tự chúng đã được chèn. Điều này cho phép tính lặp lại theo thứ tự chèn qua Set đó.
//Đó là, khi tuần hoàn qua một LinkedHashSet bởi sử dụng một Iterator, các phần tử sẽ được trả về theo thứ tự như khi chúng đã được chèn.
//Hash code sau đó được sử dụng như là index, tại đó dữ liệu mà được liên kết với key đã được lưu trữ. Phép biến đổi của key này vào trong hash code được thực hiện tự động.

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class J01LinkedHashSetDemo {
	public static void main(String args[]) {
		// tao mot hash set
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		// them cac phan tu toi hash set
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");
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
		
		Set<Integer> hs2 = new LinkedHashSet<>();
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
