package vietjack.tu16.Numbers;
//Number equals() trong Java

public class J03equals {
	public static void main(String args[]) {
		Integer x = 5;
		Integer y = 10;
		Integer z = 5;
		Short a = 5;

		//Kiểm tra có hay không đối tượng Number này là bằng với tham số
		System.out.println(x.equals(y));
		System.out.println(x.equals(z));
		System.out.println(x.equals(a));
	}
}
