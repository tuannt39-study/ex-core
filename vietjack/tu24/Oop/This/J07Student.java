package vietjack.tu24.Oop.This;

//Từ khóa this() có thể được sử dụng để triệu hồi ngầm định phương thức lớp hiện tại

public class J07Student {
	void m() {
		System.out.println("Phuong thuc duoc trieu hoi");
	}

	void n() {
		this.m(); // khong can boi vi compiler thuc hien no cho ban.
	}

	void p() {
		n(); // complier se them this de trieu hoi phuong thuc n() duoi dang this.n()
	}

	public static void main(String[] args) {
		J07Student s1 = new J07Student();
		s1.p();
	}

}
