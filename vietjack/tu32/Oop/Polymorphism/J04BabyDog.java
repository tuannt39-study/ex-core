package vietjack.tu32.Oop.Polymorphism;

//Đa hình tại runtime trong Java với kế thừa nhiều tầng (Multilevel)

class Animal {
	void eat() {
		System.out.println("an");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("an hoa qua");
	}
}

public class J04BabyDog extends Dog {
	void eat() {
		System.out.println("uong sua");
	}

	public static void main(String args[]) {
		Animal a1, a2, a3;
		a1 = new Animal();
		a2 = new Dog();
		a3 = new J04BabyDog();

		a1.eat();
		a2.eat();
		a3.eat();
	}
}