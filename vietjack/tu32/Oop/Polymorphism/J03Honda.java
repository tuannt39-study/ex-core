package vietjack.tu32.Oop.Polymorphism;

//Khi chúng ta truy cập thành viên dữ liệu mà không bị ghi đè
//Thì nó sẽ luôn luôn truy cập thành viên dữ liệu của lớp cha.
//Đa hình tại runtime không thể có được bởi thành viên dữ liệu

class Bike1 {
	int speedlimit = 90;
}

public class J03Honda extends Bike1 {
	int speedlimit = 150;

	public static void main(String args[]) {
		Bike1 obj = new J03Honda();
		System.out.println(obj.speedlimit);// 90
	}
}
