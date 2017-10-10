package vietjack.tu30.Oop.InstanceInitializerBlock;

//Instance Initializer Block được triệu hồi sau super()

class A {
	A() {
		System.out.println("constructor cua lop cha duoc trieu hoi");
	}
}

class J03B extends A {
	J03B() {
		super();
		System.out.println("constructor cua lop con duoc trieu hoi");
	}

	{
		System.out.println("instance initializer block duoc trieu hoi");
	}

	public static void main(String args[]) {
		J03B b = new J03B();
	}
}