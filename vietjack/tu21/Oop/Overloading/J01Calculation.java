package vietjack.tu21.Oop.Overloading;

public class J01Calculation {
	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sum(int a, long b) {
		System.out.println(a + b);
	}

	// Ví dụ về nạp chồng phương thức bằng cách thay đổi số tham số
	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	// Ví dụ nạp chồng phương thức bằng cách thay đổi kiểu dữ liệu của tham số
	void sum(double a, double b) {
		System.out.println(a + b);
	}

	// Ví dụ nạp chồng phương thức main()
	public static void main(int a){  
		System.out.println(a);  
	}
	
	public static void main(String[] args) {
		J01Calculation obj = new J01Calculation();
		obj.sum(20, 20);
		obj.sum(10, 10, 10);
		obj.sum(10.5, 11);
		main(10); 
	}
}
