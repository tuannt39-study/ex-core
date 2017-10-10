package vietjack.tu13.BasicOperators;
//Toán tử điều kiện (? :)

public class J06ConditionalOperator {

	public static void main(String[] args) {
		int a, b;
		a = 10;

		System.out.println("a = " + a);

		//bien x = (bieu_thuc) ? (giatri1 neu true) : (giatri1 neu true);
		b = (a == 1) ? 20 : 30;
		System.out.println("Gia tri cua b la : " + b);

		b = (a == 10) ? 20 : 30;
		System.out.println("Gia tri cua b la : " + b);
	}

}
