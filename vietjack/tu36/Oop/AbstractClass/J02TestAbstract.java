package vietjack.tu36.Oop.AbstractClass;

//Shape là lớp trừu tượng, trình triển khai của nó được cung cấp bởi lớp Rectangle và lớp Circle.
//Hai lớp này kế thừa lớp trừu tượng Shape.

//lop truu tuong Shape
abstract class Shape {
	abstract void draw();
}

// Trong tinh huong nay, trinh trien khai duoc cung cap boi ai do, vi du: nguoi su dung cuoi cung nao do
class Rectangle extends Shape {
	void draw() {
		System.out.println("Ve hinh chu nhat");
	}
}

class Circle1 extends Shape {
	void draw() {
		System.out.println("Ve hinh tron");
	}
}

// Trong tinh huong nay, phuong thuc duoc goi boi lap trinh vien hoac nguoi dung
public class J02TestAbstract {
	public static void main(String args[]) {
		Shape s = new Circle1(); // Trong tinh huong nay, doi tuong duoc cung cap thong qua phuong thuc, chang han nhu getShape()
		s.draw();
		Shape s1 = new Rectangle();
		s1.draw();
	}
}