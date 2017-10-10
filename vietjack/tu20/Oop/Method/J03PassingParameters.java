package vietjack.tu20.Oop.Method;

public class J03PassingParameters {
	public static void main(String[] args) {
		int a = 30;
		int b = 45;
		System.out.println("Truoc khi trao doi, gia tri cua a = " + a + " va b = " + b);
		// Trieu hoi phuong thuc hamTraoDoi
		hamTraoDoi(a, b);
		System.out.println("Sau khi trao doi, a = " + a + " va b = " + b);
	}

	public static void hamTraoDoi(int a, int b) {
		System.out.println("Truoc khi trao doi (ben trong phuong thuc) , a = " + a + " va b = " + b);
		// trao doi gia tri cua hai so
		int c = a;
		a = b;
		b = c;
		System.out.println("Sau khi trao doi (ben trong phuong thuc), a = " + a + " va b = " + b);
	}
}
