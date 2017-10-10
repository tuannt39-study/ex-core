package vietjack.tu35.Oop.Abstraction;

//Nếu Salary đang kế thừa lớp Employee, thì nó cần triển khai phương thức computePay() 

public class J02Salary extends Employee1 {
	private double salary; // Annual salary

	public double computePay() {
		System.out.println("Tinh toan luong tra cho " + getName());
		return salary / 52;
	}

	// Phan con lai cua dinh nghia class

}
