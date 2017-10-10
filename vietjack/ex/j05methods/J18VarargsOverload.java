package vietjack.ex.j05methods;

//Cách sử dụng các tham số biến như là một input khi thực hành với overload (nạp chồng) phương thức trong Java?

public class J18VarargsOverload {
	static void vararg(Integer... x) {
		System.out.println("Integer...");
	}

	static void vararg(String... x) {
		System.out.println("String...");
	}

	public static void main(String[] args) {
		int s = 0;
		vararg(s, s);
	}
}
