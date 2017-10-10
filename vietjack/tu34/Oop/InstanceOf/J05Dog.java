package vietjack.tu34.Oop.InstanceOf;

//Downcasting cũng có thể được thực hiện mà không sử dụng toán tử instanceof

class Animal5 {
}

class J05Dog extends Animal5 {
	static void method(Animal5 a) {
		J05Dog d = (J05Dog) a;// Day la downcasting
		System.out.println("downcasting duoc thuc hien");
	}

	public static void main(String[] args) {
		Animal5 a = new J05Dog();
		J05Dog.method(a);
		
//		Animal5 a=new Animal5();  
//		J05Dog.method(a);  
		//Bay gio la ClassCastException nhung khong trong truong hop cua toan tu instanceof  
		
	}
}