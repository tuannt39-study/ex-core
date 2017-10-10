package vietjack.tu89.Col.CollectionInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Collection Interface trong Java
//Collection Interface trong Java là nền tảng mà trên đó Collection Framework được xây dựng.
//Nó khai báo các phương thức core mà tất cả Collection sẽ có.

public class J01CollectionInterfaceDemo {
	public static void main(String[] args) {
		List<String> a1 = new ArrayList<String>();
		a1.add("Zara");
		a1.add("Mahnaz");
		a1.add("Ayan");
		System.out.println(" Cac phan tu ArrayList");
		System.out.print("\t" + a1);

		List<String> l1 = new LinkedList<String>();
		l1.add("Zara");
		l1.add("Mahnaz");
		l1.add("Ayan");
		System.out.println();
		System.out.println(" Cac phan tu LinkedList");
		System.out.print("\t" + l1);

		Set<String> s1 = new HashSet<String>();
		s1.add("Zara");
		s1.add("Mahnaz");
		s1.add("Ayan");
		System.out.println();
		System.out.println(" Cac phan tu Set");
		System.out.print("\t" + s1);

		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("Zara", "8");
		m1.put("Mahnaz", "31");
		m1.put("Ayan", "12");
		m1.put("Daisy", "14");
		System.out.println();
		System.out.println(" Cac phan tu Map");
		System.out.print("\t" + m1);
	}
}
