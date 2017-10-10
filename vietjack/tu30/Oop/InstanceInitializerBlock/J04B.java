package vietjack.tu30.Oop.InstanceInitializerBlock;

class A1 {
	A1() {
		System.out.println("constructor cua lop cha duoc trieu hoi");
	}
}

class J04B extends A1 {
	J04B() {
		super();
		System.out.println("constructor cua lop con duoc trieu hoi");
	}

	J04B(int a) {
		super();
		System.out.println("constructor cua lop con duoc trieu hoi " + a);
	}

	{
		System.out.println("instance initializer block duoc trieu hoi");
	}

	public static void main(String args[]) {
		J04B b1 = new J04B();
		J04B b2 = new J04B(10);
	}
}