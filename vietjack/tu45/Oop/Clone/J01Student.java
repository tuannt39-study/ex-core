package vietjack.tu45.Oop.Clone;

//Nhân bản đối tượng với phương thức clone() trong Java

public class J01Student implements Cloneable {
	int rollno;
	String name;

	J01Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

//	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}

	public static void main(String args[]) {
		try {
			J01Student s1 = new J01Student(101, "hoang");

			J01Student s2 = (J01Student) s1.clone();

			System.out.println(s1.rollno + " " + s1.name);
			System.out.println(s2.rollno + " " + s2.name);

		} catch (CloneNotSupportedException c) {
			
		}
	}
}