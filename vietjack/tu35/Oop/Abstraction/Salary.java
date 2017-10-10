package vietjack.tu35.Oop.Abstraction;

//Kế thừa lớp Employee 

public class Salary extends Employee {
	private double salary; // Annual salary

	public Salary(String name, String address, int number, double salary) {
		super(name, address, number);
		setSalary(salary);
	}

	public void mailCheck() {
		System.out.println("Ben trong mailCheck cua Salary class ");
		System.out.println("Gui mail kiem tra toi " + getName() + " voi salary la " + salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double newSalary) {
		if (newSalary >= 0.0) {
			salary = newSalary;
		}
	}

	public double computePay() {
		System.out.println("Tinh toan luong tra cho " + getName());
		return salary / 52;
	}
}