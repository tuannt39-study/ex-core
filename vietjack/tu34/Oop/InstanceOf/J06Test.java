package vietjack.tu34.Oop.InstanceOf;

//Sự sử dụng thực sự của instanceof trong Java

interface Printable {
}

class A implements Printable {
	public void a() {
		System.out.println("Phuong thuc a");
	}
}

class B implements Printable {
	public void b() {
		System.out.println("Phuong thuc b");
	}
}

class Call {
	void invoke(Printable p) { // Day la upcasting
		if (p instanceof A) {
			A a = (A) p;// Day la Downcasting
			a.a();
		}
		if (p instanceof B) {
			B b = (B) p;// Day la Downcasting
			b.b();
		}

	}
}// Phan cuoi cua lop Call

public class J06Test {
	public static void main(String args[]) {
		Printable pb = new B();
		Printable pa = new A();
		Call c = new Call();
		c.invoke(pa);
		c.invoke(pb);
	}
}