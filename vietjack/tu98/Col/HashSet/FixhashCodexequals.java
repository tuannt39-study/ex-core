package vietjack.tu98.Col.HashSet;

//Tránh trùng lặp trong Set, ta nên ghi đè 2 phương thức có sẵn hashCode() và equals() 

import java.util.HashSet;
import java.util.Set;

class Person2 {

	private int id;

	public Person2(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 17 * hash + this.id;
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Person2 other = (Person2) obj;
		if (this.id != other.id) {
			return false;
		}
		return true;
	}

}

public class FixhashCodexequals {

	public static void main(String[] args) {
		Set<Person2> hs = new HashSet<>();
		hs.add(new Person2(3));
		hs.add(new Person2(2));
		hs.add(new Person2(1));
		hs.add(new Person2(4));
		hs.add(new Person2(1));

		for (Person2 Person2 : hs) {
			System.out.print(Person2.getId() + " ");
		}

		// 1 2 3 4
	}

}