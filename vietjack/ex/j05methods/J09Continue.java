package vietjack.ex.j05methods;

//Cách sử dụng lệnh continue trong một phương thức trong Java?

public class J09Continue {
	public static void main(String[] args) {
		StringBuffer searchstr = new StringBuffer("hello how are you. ");
		int length = searchstr.length();
		int count = 0;
		for (int i = 0; i < length; i++) {
			if (searchstr.charAt(i) != 'h')
				continue;
			count++;
			searchstr.setCharAt(i, 'h');
		}
		System.out.println("Found " + count + " h's in the string.");
		System.out.println(searchstr);
	}
}
