package vietjack.tu96.Col.LinkedList;

//Lớp LinkedList trong Java
//Lớp LinkedList trong Java kế thừa lớp AbstractSequentialList và triển khai List Interface. Nó cung cấp một cấu trúc dữ liệu linked-list (dạng danh sách được liên kết).

import java.util.LinkedList;

public class J01LinkedListDemo {
	public static void main(String args[]) {
		// tao mot linked list
		LinkedList<String> ll = new LinkedList<String>();
		// them cac phan tu toi linked list
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		ll.add("C");
		ll.addLast("Z");
		ll.addFirst("A");
		ll.add(1, "A2");
		System.out.println("Noi dung ban dau cua LinkedList: \n" + ll);

		// xoa cac phan tu tu linked list
		ll.remove("F");
		ll.remove(2);
		System.out.println("Noi dung cua LinkedList sau khi xoa: \n" + ll);

		// xoa cac phan tu dau tien va cuoi cung
		ll.removeFirst();
		ll.removeLast();
		System.out.println("LinkedList sau khi xoa phan tu dau tien va cuoi cung: \n" + ll);

		// lay va thiet lap mot gia tri
		Object val = ll.get(2);
		ll.set(2, (String) val + " Dathaydoi");
		ll.set(1, "XX");
		System.out.println("LinkedList sau khi thay doi: \n" + ll);
	}
}
