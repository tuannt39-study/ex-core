package vietjack.tu35.Oop.Abstraction;

//Phương thức abstract sẽ không có định nghĩa, và chữ số của nó được theo sau bởi dấu chấm phảy
//không có dấu ngoặc móc ôm theo sau

public abstract class Employee1 {
	private String name;
	private String address;
	private int number;

	public abstract double computePay();

	public String getName() {
		return name;
	}
	// Phan con lai cua dinh nghia class
}
