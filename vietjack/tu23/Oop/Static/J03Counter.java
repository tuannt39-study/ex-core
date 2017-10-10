package vietjack.tu23.Oop.Static;

//Chương trình counter với biến static trong Java

public class J03Counter {
	static int count = 0; // se lay bo nho chi mot lan và giu lai gia tri cua no
	// ket qua thuc hien in ra 3 dong cac gia tri : 1,2,3

	J03Counter() {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		J03Counter c1 = new J03Counter();
		J03Counter c2 = new J03Counter();
		J03Counter c3 = new J03Counter();
	}
}
