package vietjack.tu23.Oop.Static;

//Ví dụ khác về phương thức static mà thực hiện phép tính toán thông thường

public class J05Calculate {
	static int cube(int x) {
		return x * x * x;
	}

	public static void main(String[] args) {
		int result = J05Calculate.cube(5);
		System.out.println(result);
	}

}
