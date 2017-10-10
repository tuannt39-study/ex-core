package vietjack.ex.j02strings;

//Cách đảo ngược một String trong Java?

public class J05StringReverseExample {
	public static void main(String[] args) {
		String string = "abcdef";
		
		//Phương thức reverse() đảo ngược chuỗi hiện tại của class StringBuffer
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println("\nString before reverse: " + string);
		System.out.println("String after reverse: " + reverse);
	}
}
