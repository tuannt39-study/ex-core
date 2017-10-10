package vietjack.tu23.Oop.Static;

//Ví dụ về phương thức static trong Java

public class J04Student {
	int rollno;
	String name;
	static String college = "BachKhoa";

	static void change() {
		college = "QuocGia";
	}

	J04Student(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	public static void main(String[] args) {
		J04Student.change();
		J04Student s1 = new J04Student(111, "Hoang");
		J04Student s2 = new J04Student(222, "Thanh");
		J04Student s3 = new J04Student(333, "Nam");
		s1.display();
		s2.display();
		s3.display();
	}

}
