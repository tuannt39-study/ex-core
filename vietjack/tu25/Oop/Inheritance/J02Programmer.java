package vietjack.tu25.Oop.Inheritance;

public class J02Programmer extends J01Employee {

	int bonus = 10000;

	public static void main(String[] args) {
		J02Programmer p = new J02Programmer();
		System.out.println("Lương của lập trình viên: " + p.salary);
		System.out.println("Tiền thưởng của lập trình viên: " + p.bonus);
	}

}
