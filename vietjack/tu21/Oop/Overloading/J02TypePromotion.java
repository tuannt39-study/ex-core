package vietjack.tu21.Oop.Overloading;

// Ví dụ nạp chồng phương thức với TypePromotion

public class J02TypePromotion {
	void sum(int a, long b) {
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	public static void main(String[] args) {
		J02TypePromotion obj = new J02TypePromotion();
		obj.sum(20, 20); // Bay gio int literal thu hai se duoc promote thanh long
		obj.sum(20, 20, 20);
	}

}
