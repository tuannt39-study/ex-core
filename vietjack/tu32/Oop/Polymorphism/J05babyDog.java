package vietjack.tu32.Oop.Polymorphism;

//Đa hình tại runtime trong Java với kế thừa nhiều tầng (Multilevel)
//BabyDog không ghi đè phương thức eat(), do đó phương thức eat() của lớp Dog() được triệu hồi.

class Animal1 {
	void eat() {
		System.out.println("animao dang an...");
	}
}

class Dog1 extends Animal1 {
	void eat() {
		System.out.println("dog dang an...");
	}
}

public class J05babyDog extends Dog1 {
	public static void main(String args[]) {
		Animal1 a = new J05babyDog();
		a.eat();
	}
}