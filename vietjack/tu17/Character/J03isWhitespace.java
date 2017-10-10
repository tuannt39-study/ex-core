package vietjack.tu17.Character;
//isWhitespace() trong Java

public class J03isWhitespace {
	public static void main(String args[]) {

		// Xác định có hay không giá trị char đã cho là một khoảng trắng
		System.out.println(Character.isWhitespace('c'));
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isWhitespace('\n'));
		System.out.println(Character.isWhitespace('\t'));
	}
}
