package h17jb3.tu3.Collections;
//Ví dụ về ArrayList

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println("Nhap chuoi den khi gap 'end' thi dung: ");
		while (true) {
			Scanner scan = new Scanner(System.in);
			String s = scan.next();
			if (s.equalsIgnoreCase("end")) {
				break;
			}
			list.add(s);
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println((String) list.get(i));
		}
	}
}
