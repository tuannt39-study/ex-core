package vietjack.tu87.Data.Properties;

//Lớp Properties trong Java
//Lớp Properties trong Java là lớp phụ của lớp Hashtable.
//Nó được sử dụng để duy trì các danh sách của các value trong đó key là một String và value cũng là một String.

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class J01PropDemo {
	public static void main(String args[]) {
		Properties capitals = new Properties();
		Set<Object> states;
		String str;

		capitals.put("Illinois", "Springfield");
		capitals.put("Missouri", "Jefferson City");
		capitals.put("Washington", "Olympia");
		capitals.put("California", "Sacramento");
		capitals.put("Indiana", "Indianapolis");

		// Hien thi tat ca cac state va capital trong hashtable.
		states = capitals.keySet(); // lay set-view cua cac key
		Iterator<Object> itr = states.iterator();
		while (itr.hasNext()) {
			str = (String) itr.next();
			System.out.println("Thu phu cua " + str + " la " + capitals.getProperty(str) + ".");
		}
		System.out.println();

		// tim kiem state khong co trong list -- xac dinh mac dinh
		str = capitals.getProperty("Florida", "Not Found");
		System.out.println("Thu phu cua Florida la " + str + ".");
	}
}
