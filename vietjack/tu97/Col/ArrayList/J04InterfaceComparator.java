package vietjack.tu97.Col.ArrayList;

//Sử dụng interface Comparator
//
//Ta sẽ tạo các lớp “tiêu chí so sánh” cài đặt interface Comparator và ghi đè phương thức compare(Object, Object). Tương tự như compareTo(), compare() cũng trả về:
//
//== 0 nếu đối tượng 1 == đối tượng 2.
//> 0 nếu đối tượng 1 > đối tượng 2.
//< 0 nếu đối tượng 1 < đối tượng 2.
//Sau đó ta dùng phương thức sort(List, Comparator) của lớp tiện ích java.util.Collections để sắp xếp.
//
//Ví dụ: Sắp xếp danh sách sinh viên theo tên CBA và tuổi tăng dần.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student4 {

	private String name;
	private int age;

	public Student4(String name, int age) {
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
		return "Student4{" + "name=" + name + ", age=" + age + '}';
	}

}

class NameComparator implements Comparator<Student4> {

	@Override
	public int compare(Student4 o1, Student4 o2) {
		return o2.getName().compareTo(o1.getName());
	}

}

class AgeComparator implements Comparator<Student4> {

	@Override
	public int compare(Student4 o1, Student4 o2) {
		if (o1.getAge() == o2.getAge()) {
			return 0;
		} else if (o1.getAge() < o2.getAge()) {
			return -1;
		} else {
			return 1;
		}
	}

}

public class J04InterfaceComparator {

	public static void main(String[] args) {
		List<Student4> Student4s = new ArrayList<>();
		Student4s.add(new Student4("Bob", 18));
		Student4s.add(new Student4("Alice", 20));
		Student4s.add(new Student4("Cany", 19));

		Collections.sort(Student4s, new NameComparator());
		for (Student4 Student4 : Student4s) {
			System.out.println(Student4.toString());
		}
		System.out.println();
		// Student4{name=Cany, age=19}
		// Student4{name=Bob, age=18}
		// Student4{name=Alice, age=20}

		Collections.sort(Student4s, new AgeComparator());
		for (Student4 Student4 : Student4s) {
			System.out.println(Student4.toString());
		}
		// Student4{name=Bob, age=18}
		// Student4{name=Cany, age=19}
		// Student4{name=Alice, age=20}
	}

}