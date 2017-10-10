package vietjack.tu28.Oop.Covariant;

class A {
	A get() {
		return this;
	}
}

class J01Covariant extends A {
	J01Covariant get() {
		return this;
	}

	void message() {
		System.out.println("Kiểu trả về covariant");
	}

	public static void main(String args[]) {
		new J01Covariant().get().message();
	}
}