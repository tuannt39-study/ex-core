package vietjack.tu34.Oop.InstanceOf;

//Thực hiện downcasting với toán tử instanceof trong Java.

class Animal4 {
}

class J04Dog extends Animal4 {
	static void method(Animal4 a) {
		if (a instanceof J04Dog) {
			J04Dog d = (J04Dog) a; // day la downcasting
			System.out.println("Bay gio downcasting duoc thuc hien");
		}
	}

	public static void main(String[] args) {
		Animal4 a = new J04Dog();
		J04Dog.method(a);
	}

}