package vietjack.tu23.Oop.Static;

//Ví dụ về biến static trong Java

public class J01Student {
	int rollno;
	String name;
	static String college = "BachKhoa";

	J01Student(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	public static void main(String[] args) {
		J01Student s1 = new J01Student(111, "Hoang");
		J01Student s2 = new J01Student(222, "Thanh");

		s1.display();
		s2.display();
	}
}
