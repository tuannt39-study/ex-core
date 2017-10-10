package test;

import java.util.HashSet;

class Person {
	int id;
	String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<Person> set=new HashSet<Person>();
		Person p1=new Person(1,"test");
		Person p2=new Person(1,"test");
		set.add(p1);
		set.add(p2);
		System.out.println(set.size());
		System.out.println(p1.equals(p2));
	}
}
