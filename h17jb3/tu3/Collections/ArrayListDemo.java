package h17jb3.tu3.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		
		arrayList.add(1);
		arrayList.add(6);
		arrayList.add("Chao");
		arrayList.add("ban");
		arrayList.add(13.8);
		arrayList.add("xsa");
		
		System.out.println(arrayList);
		
		arrayList.add(4, "Noi dung");
		arrayList.add(4, "Noi dung truoc");
		arrayList.set(0, 9);
		
		System.out.println("Lay theo vi tri: ");
		for (int i=0; i<arrayList.size(); i++){
			System.out.println("I " + i + " pt: " + arrayList.get(i));
		}
		
		ArrayList arrayList2 = new ArrayList(arrayList);
		System.out.println(arrayList2);
		
		arrayList.add(4, arrayList2);
		System.out.println(arrayList);
		
		System.out.println("Lay theo nterator: ");
		Iterator it = arrayList.iterator();
		int i=0;
		while (it.hasNext()) {
			System.out.println("pt: " + it.next());
			if (i>2) break;
			i++;
		}
		System.out.println("Ngoai pt: " + it.next());
		
		System.out.println("Lay theo for each");
		for (Object obj: arrayList) {
			System.out.println("pt - : " + obj);
		}
		
		System.out.println("Lay theo kieu String");
		ArrayList<String> strArr = new ArrayList<String>();
		strArr.add("1");
		strArr.add("chuoi 2");
		for (String obj: strArr) {
			System.out.println("pt: + " + obj);
		}
	}
}
