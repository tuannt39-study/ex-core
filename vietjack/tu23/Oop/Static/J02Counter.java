package vietjack.tu23.Oop.Static;

//Chương trình Counter mà không sử dụng biến static

public class J02Counter {
	int count = 0; // se lay bo nho (memory) khi bien instance duoc tao
	// Ket qua thuc hien chuong trinh hien ra 3 so 1 o 3 dong

	J02Counter() {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		J02Counter c1 = new J02Counter();
		J02Counter c2 = new J02Counter();
		J02Counter c3 = new J02Counter();
	}
}
