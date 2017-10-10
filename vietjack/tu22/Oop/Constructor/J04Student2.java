package vietjack.tu22.Oop.Constructor;

//Nạp chồng Constructor trong Java

public class J04Student2 {
	int id;
	String name;
	int age;

	J04Student2(int i, String n) {
		id = i;
		name = n;
	}

	J04Student2(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String args[]) {
		J04Student2 s1 = new J04Student2(111, "Hoang");
		J04Student2 s2 = new J04Student2(222, "Thanh", 25);
		s1.display();
		s2.display();
	}
}

/* Điểm khác nhau giữa Constructor và Method trong Java
- Constructor:
+ Constructor được sử dụng để khởi tạo trạng thái của một đối tượng
+ Constructor phải không có kiểu trả về	
+ Constructor được triệu hồi một cách ngầm định	
+ Compiler cung cấp một Constructor mặc định nếu bạn không có bất cứ Constructor nào	
+ Tên Constructor phải giống tên lớp	

- Method:
+ Phương thức được sử dụng để trưng bày hành vi của một đối tượng
+ Phương thức phải có kiểu trả về
+ Phương thức phải được triệu hồi một cách tường minh
+ Phương thức không được cung cấp bởi Compiler trong bất cứ trường hợp nào
+ Tên phương thức có thể hoặc không giống như tên lớp

*/
