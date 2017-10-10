package vietjack.tu21.Oop.Overloading;

// Nếu có kết nối về các tham số kiểu trong phương thức, thì TypePromotion không được thực hiện.

public class J03TypePromotion {
	void sum(int a, int b) {
		System.out.println("phuong thuc int arg duoc trieu hoi");
	}

	void sum(long a, long b) {
		System.out.println("phuong thuc long arg duoc trieu hoi");
	}

	public static void main(String[] args) {
		J03TypePromotion obj = new J03TypePromotion();
		obj.sum(20, 20); // Bay gio phuong thuc int arg sum() duoc trieu hoi

	}

}
