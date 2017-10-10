package vietjack.tu35.Oop.Abstraction;

//Sử dụng từ khóa abstract để khai báo một lớp abstract

public abstract class Employee {
	private String name;
	private String address;
	private int number;

	public Employee(String name, String address, int number) {
		System.out.println("Xay dung mot Employee");
		this.name = name;
		this.address = address;
		this.number = number;
	}

	public double computePay() {
		System.out.println("Ben trong Employee computePay");
		return 0.0;
	}

	public void mailCheck() {
		System.out.println("Gui mail kiem tra toi " + this.name + " " + this.address);
	}

	public String toString() {
		return name + " " + address + " " + number;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String newAddress) {
		address = newAddress;
	}

	public int getNumber() {
		return number;
	}
}
