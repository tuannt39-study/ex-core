package vietjack.tu29.Oop.Super;

//super() được sử dụng để triệu hồi Constructor của lớp cha gần nhất

class J03Bike extends Vehicle1 {
	J03Bike() {
		super();// se trieu hoi constructor cua lop cha
		System.out.println("Bike duoc tao");
	}

	public static void main(String args[]) {
		J03Bike b = new J03Bike();
	}
}