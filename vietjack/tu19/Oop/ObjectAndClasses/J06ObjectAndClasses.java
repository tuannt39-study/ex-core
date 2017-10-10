package vietjack.tu19.Oop.ObjectAndClasses;

public class J06ObjectAndClasses {
	int rollno;
	String name;

	void insertRecord(int r, String n) { // phuong thuc
		rollno = r;
		name = n;
	}

	void displayInformation() {
		System.out.println(rollno + " " + name);
	} // phuong thuc

	public static void main(String args[]) {
		J06ObjectAndClasses s1 = new J06ObjectAndClasses();
		J06ObjectAndClasses s2 = new J06ObjectAndClasses();

		s1.insertRecord(111, "HoangThanh");
		s2.insertRecord(222, "ThanhHuong");

		s1.displayInformation();
		s2.displayInformation();

	}
}
