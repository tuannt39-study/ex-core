package vietjack.tu99100.Col.TreeSet;

//Ví dụ: Dùng interface Comparator sắp xếp danh sách sinh viên theo CBA.

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Student3 {

	private String name;
	private int age;

	public Student3(String name, int age) {
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
		return "Student3{" + "name=" + name + ", age=" + age + '}';
	}

}

public class J03SortComparator {

	public static void main(String[] args) {
		Set<Student3> Student3s = new TreeSet<>(new Comparator<Student3>() {
			@Override
			public int compare(Student3 o1, Student3 o2) {
				return o2.getName().compareTo(o1.getName());
			}
		});
		Student3s.add(new Student3("Bob", 18));
		Student3s.add(new Student3("Alice", 20));
		Student3s.add(new Student3("Cany", 19));

		for (Student3 Student3 : Student3s) {
			System.out.println(Student3.toString());
		}
		// Student3{name=Cany, age=19}
		// Student3{name=Bob, age=18}
		// Student3{name=Alice, age=20}
	}

}