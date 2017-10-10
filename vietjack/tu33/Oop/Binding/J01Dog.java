package vietjack.tu33.Oop.Binding;

//Khi kiểu của đối tượng được quyết định tại compile time (bởi Compiler) thì đó là static binding
//Nếu có bất cứ phương thức private, final hoặc static nào trong một lớp, thì đó là gắn kết tĩnh.
//Do đó, không thể có chuyện ghi đè (overloading) kết quả đối với lập trình hướng đối tượng trong Static binding

public class J01Dog {
	private void eat() {
		System.out.println("dog dang an...");
	}

	public static void main(String args[]) {
		J01Dog d1 = new J01Dog();
		d1.eat();
	}
}
