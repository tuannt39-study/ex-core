package vietjack.tu26.Oop.HASA;

//Mối quan hệ là Employee HAS-A address.

public class J02Emp {
	int id;
	String name;
	Address address;

	public J02Emp(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}

	public static void main(String[] args) {
		Address address1 = new Address("hanoi", "HN", "vietnam");
		Address address2 = new Address("hadong", "HN", "vietnam");

		J02Emp e = new J02Emp(111, "hoang", address1);
		J02Emp e2 = new J02Emp(112, "thanh", address2);

		e.display();
		e2.display();
	}
}
