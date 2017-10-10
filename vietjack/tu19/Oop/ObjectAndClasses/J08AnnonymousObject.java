package vietjack.tu19.Oop.ObjectAndClasses;

public class J08AnnonymousObject {
	void fact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("factorial is " + fact);
	}

	public static void main(String args[]) {
		new J08AnnonymousObject().fact(5); // Goi phuong thuc voi doi tuong vo danh (annonymous)
	}
}
