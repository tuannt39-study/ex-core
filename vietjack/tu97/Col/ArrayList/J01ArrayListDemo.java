package vietjack.tu97.Col.ArrayList;

//Lớp ArrayList trong Java
//Lớp ArrayList trong Java kế thừa AbstractList và triển khai List Interface. Lớp ArrayList hỗ trợ các mảng động mà có thể tăng kích cỡ nếu cần.
//Các mảng Java chuẩn là có độ dài cố định. Sau khi các mảng được tạo, chúng không thể tăng hoặc giảm kích cỡ, nghĩa là bạn phải có bao nhiêu phần tử mà một mảng sẽ giữ.
//ArrayList được tạo với một kích cỡ ban đầu. Khi kích cỡ này bị vượt, collection tự động được tăng. Khi các đối tượng bị gỡ bỏ, ArrayList có thể bị giảm kích cỡ.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class J01ArrayListDemo {
	public static void main(String args[]) {
		// tao mot array list
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Size ban dau cua ArrayList la: \n" + al.size());

		// them cac phan tu toi array list
		al.add("C");
		al.add("A");
		al.add("C");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1, "A2");

		System.out.println("Size cua ArrayList sau khi them la: \n" + al.size());

		// display the array list
		System.out.println("Noi dung cua ArrayList la: \n" + al);
		// xoa cac phan tu tu array list
		al.remove("F");
		al.remove(2);
		al.set(1, "XX");
		System.out.println("Size cua ArrayList sau khi xoa la: \n" + al.size());
		System.out.println("Noi dung cua ArrayList la: " + al);

		System.out.println();

		Iterator<String> i = al.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		
		System.out.println();
		
		List<Integer> al2 = new ArrayList<>();
        al2.add(3);
        al2.add(2);
        al2.add(null);
        al2.add(4);
        al2.add(1);
		
        System.out.println("\nMảng 2: \n" + al2);
        
        System.out.println("\nMảng 2 foreach: \n");
        
        for (Integer b : al2) {
            System.out.print(b + " ");
        }
        
        System.out.println("\n");
        
        ListIterator<Integer> a = al2.listIterator();
        while (a.hasNext()) {
            System.out.println(a.nextIndex() + " -> " + a.next());
        }
        System.out.println();
        
        while (a.hasPrevious()) {
            System.out.println(a.previousIndex()+ " -> " + a.previous());
        }
        System.out.println();

	}
}
