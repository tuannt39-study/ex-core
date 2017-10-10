package h17jb3.tu3.Collections;

public class Student {
	public static String CLASSLOP="Lop Java";
	public int tuoi=9;
	private String name;
	
	public static void main(String[] args) {
		Student s = new Student();
		Student s2 = new Student(8, "Sinh vien B");
		System.out.println("Tuoi: " + s.tuoi + "\nTen: " + s.name);
		System.out.println("Tuoi: " + s2.tuoi + "\nTen: " + s2.name);
		s2.setTuoi(10);
		System.out.println("Tuoi: " + s2.getTuoi() + "\nTen: " + s2.name);
	}
	
	Student() {
		this.name="Sinh vien A";
	}
	
	Student(int tuoi, String name) {
		this.tuoi=tuoi;
		this.name=name;
	}
	
	public int getTuoi() {
		return tuoi;
	}
	
	public void setTuoi(int tuoi) {
		this.tuoi=tuoi;
	}
}

class Person {
	
}
