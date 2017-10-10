package vietjack.tu98.Col.HashSet;

//Theo lý thuyết, trong HashSet không tồn tại các phần tử trùng lặp.
//Nhưng rõ ràng ở đây, ta lại thấy có 2 đối tượng Person(1).
//Đó là bởi 2 đối tượng này khác biệt nhau (vì tham chiếu đến 2 vùng nhớ khác nhau).
//Do đó để tránh trùng lặp trong Set, ta nên ghi đè 2 phương thức có sẵn hashCode() và equals() 
//(các IDE phổ biến đều đã hỗ trợ ta tự động sinh 2 phương thức này)
//Class FixhashCodexequals

import java.util.HashSet;
import java.util.Set;

class Person {

	private int id;

	public Person(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

public class hashCodexequals {

	public static void main(String[] args) {
		Set<Person> hs = new HashSet<>();
		hs.add(new Person(3));
		hs.add(new Person(2));
		hs.add(new Person(1));
		hs.add(new Person(4));
		hs.add(new Person(1));

		for (Person person : hs) {
			System.out.print(person.getId() + " ");
		}

		// 1 1 3 2 4
	}

}