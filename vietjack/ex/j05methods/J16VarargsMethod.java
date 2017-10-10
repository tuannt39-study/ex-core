package vietjack.ex.j05methods;

//Cách tạo một phương thức lấy tham số độ dài biến như là một input trong Java?

public class J16VarargsMethod {
	static void display(String... values) {
		System.out.println("display method invoked ");
		for (String s : values) {
			System.out.println(s);
		}
	}

	public static void main(String args[]) {
		display();
		display("Tutorialspoint");
		display("my", "name", "is", "Sairamkrishna Mammahe");
	}
}
