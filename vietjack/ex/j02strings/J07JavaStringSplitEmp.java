package vietjack.ex.j02strings;

//Cách chia một String thành các chuỗi phụ trong Java?

public class J07JavaStringSplitEmp {
	public static void main(String args[]) {
		String str = "jan-feb-march";
		String regex = "-";
		
		//Chia chuỗi này xung quanh các so khớp của Regex đã cho
		String[] temp = str.split(regex);
		for (String st: temp) {
			System.out.println(st);
		}
		
		System.out.println();
		
		String str2 = "jan.feb.march";
		String regex2 = "\\.";
		String[] temp2 = str2.split(regex2);
		for (String st2: temp2) {
			System.out.println(st2);
		}

		System.out.println();
		
		String str3 = "jan.feb.march";
		String regex3 = "\\.";
		String[] temp3 = str3.split(regex3, 2);
		for (String st3: temp3) {
			System.out.println(st3);
		}
		
//		for (int i = 0; i < temp.length; i++) {
//			System.out.println(temp[i]);
//			System.out.println("");
//			str = "jan.feb.march";
//			delimeter = "\\.";
//			temp = str.split(delimeter);
//		}
//		for (int i = 0; i < temp.length; i++) {
//			System.out.println(temp[i]);
//			System.out.println("");
//			temp = str.split(delimeter, 2);
//			for (int j = 0; j < temp.length; j++) {
//				System.out.println(temp[j]);
//			}
//		}
	}
}
