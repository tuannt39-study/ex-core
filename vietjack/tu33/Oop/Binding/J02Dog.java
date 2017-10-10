package vietjack.tu33.Oop.Binding;

//Khi kiểu của đối tượng được quyết định tại runtime thì đó là gắn kết động (Dynamic Binding).
//Kiểu đối tượng không thể được quyết định bởi Compiler, bởi vì sự thể hiện của Dog cũng là một sự thể hiện của Animal.
//Vì thế Compiler không biết kiểu nào của nó, chỉ biết đến kiểu cơ sở.

class Animal2 {
	void eat() {
		System.out.println("Animal2 dang an...");
	}
}

public class J02Dog extends Animal2 {
	void eat() {
		System.out.println("dog dang an...");
	}

	public static void main(String args[]) {
		Animal2 a = new J02Dog();
		a.eat();
	}
}