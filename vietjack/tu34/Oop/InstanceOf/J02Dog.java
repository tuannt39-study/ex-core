package vietjack.tu34.Oop.InstanceOf;

//Dog kế thừa Animal thì đối tượng Dog có thể được tham chiếu bởi hoặc lớp Dog hoặc lớp Animal.

class Animal2 {
}

public class J02Dog extends Animal2 {// Dog ke thua Animal

	public static void main(String args[]) {
		J02Dog d = new J02Dog();
		System.out.println(d instanceof Animal2);// true
		System.out.println(d instanceof J02Dog);// true
	}
}