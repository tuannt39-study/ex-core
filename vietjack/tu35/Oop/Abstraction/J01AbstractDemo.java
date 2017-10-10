package vietjack.tu35.Oop.Abstraction;

//Không thể khởi tạo một Employee mới, nhưng nếu chúng ta khởi tạo một đối tượng Salary mới
//Đối tượng Salary này sẽ kế thừa 3 trường, 7 phương thức từ Employee

public class J01AbstractDemo {
	public static void main(String[] args) {
		Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
		Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);

		System.out.println("Goi mailCheck boi su dung tham chieu Salary --");
		s.mailCheck();

		System.out.println("Goi mailCheck boi su dung tham chieu Employee --");
		e.mailCheck();
	}
}
