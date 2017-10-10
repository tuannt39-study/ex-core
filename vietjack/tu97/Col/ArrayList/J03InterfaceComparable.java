package vietjack.tu97.Col.ArrayList;

//Sử dụng interface Comparable
//
//Lúc này, lớp của ta phải ghi đè phương thức compareTo(Object). Phương thức này trả về:
//
//== 0 nếu đối tượng 1 == đối tượng 2.
//> 0 nếu đối tượng 1 > đối tượng 2.
//< 0 nếu đối tượng 1 < đối tượng 2.
//Sau đó ta dùng phương thức sort(List) của lớp tiện ích java.util.Collections để sắp xếp.
//
//Ví dụ: Sắp xếp danh sách sinh viên theo tên ABC:

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {

	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student{" + "name=" + name + ", age=" + age + '}';
	}

	@Override
	public int compareTo(Student o) {
		return this.getName().compareTo(o.getName());
	}

}

public class J03InterfaceComparable {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Bob", 18));
		students.add(new Student("Alice", 20));
		students.add(new Student("Cany", 19));

		Collections.sort(students);
		for (Student student : students) {
			System.out.println(student.toString());
		}

		// Student{name=Alice, age=20}
		// Student{name=Bob, age=18}
		// Student{name=Cany, age=19}
	}
}
