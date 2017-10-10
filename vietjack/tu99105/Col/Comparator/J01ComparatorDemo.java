package vietjack.tu99105.Col.Comparator;

//Sử dụng Comparator trong Java
//Cả TreeSet và TreeMap đều lưu giữ các phần tử trong thứ tự đã được sắp xếp. Tuy nhiên, chính Comparator định nghĩa chính xác ý nghĩa của sorted order.
//Comparator Interface định nghĩa 2 phương thức: compare() và equals()

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Dog implements Comparator<Dog>, Comparable<Dog> {
	private String name;
	private int age;

	Dog() {
	}

	Dog(String n, int a) {
		name = n;
		age = a;
	}

	public String getDogName() {
		return name;
	}

	public int getDogAge() {
		return age;
	}

	// Ghi de phuong thuc compareTo
	public int compareTo(Dog d) {
		return (this.name).compareTo(d.name);
	}

	// Ghi de phuong thuc compare de sap xep age
	public int compare(Dog d, Dog d1) {
		return d.age - d1.age;
	}
}

public class J01ComparatorDemo {

	public static void main(String args[]) {
		// Lay danh sach cac doi tuong Dog
		List<Dog> list = new ArrayList<Dog>();
		list.add(new Dog("Shaggy", 3));
		list.add(new Dog("Lacy", 2));
		list.add(new Dog("Roger", 10));
		list.add(new Dog("Tommy", 4));
		list.add(new Dog("Tammy", 1));
		Collections.sort(list);// Sap xep array list

		for (Dog a : list)// in danh sach cac name sau khi da sap xep
			System.out.print(a.getDogName() + ", ");

		// Sap xep array list boi su dung comparator
		Collections.sort(list, new Dog());
		System.out.println(" ");
		for (Dog a : list)// in danh sach da qua sap xep cua age
			System.out.print(a.getDogName() + "  : " + a.getDogAge() + ", ");
	}
}