package vietjack.tu99100.Col.TreeSet;

//Sắp xếp TreeSet
//
//TreeSet mặc định là sắp xếp tăng dần.
//
//Để sắp xếp giảm dần TreeSet, ta có 2 cách giống List:
//
//Dùng interface Comparable, TreeSet sẽ tự động sắp xếp giảm dần.
//Dùng interface Comparator.
//Ví dụ: Dùng interface Comparable sắp xếp danh sách sinh viên theo CBA.

import java.util.Set;
import java.util.TreeSet;

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
		return o.getName().compareTo(this.getName());
	}

}

public class J02SortComparable {

	public static void main(String[] args) {
		Set<Student> students = new TreeSet<>();
		students.add(new Student("Bob", 18));
		students.add(new Student("Alice", 20));
		students.add(new Student("Cany", 19));

		for (Student student : students) {
			System.out.println(student.toString());
		}
		// Student{name=Cany, age=19}
		// Student{name=Bob, age=18}
		// Student{name=Alice, age=20}
	}

}