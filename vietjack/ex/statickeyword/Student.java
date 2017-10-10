package vietjack.ex.statickeyword;

public class Student {
	private String name;
	private static int numbers;
	
	public Student(String name) {
		this.name=name;
		System.out.println("Sinh viên mới tên là: " + name);
		numbers++;
		System.out.println("Số lượng sinh viên trong lớp là: " + numbers);
	}
	
	public String getName() {
		return this.name;
	}
	
	public static int getNumbers() {
		return numbers;
	}
}
