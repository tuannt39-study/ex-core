package vietjack.tu24.Oop.This;

//Từ khóa this có thể được truyền như là một tham số trong phương thức

public class J08Student {

	void m(J08Student obj) {
		System.out.println("Phuong thuc duoc trieu hoi");
	}

	void p() {
		m(this);
	}

	public static void main(String args[]) {
		J08Student s1 = new J08Student();
		s1.p();
	}

}
