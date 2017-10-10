package vietjack.ex.j03arrays;

//Cách kế thừa một Mảng (Array) sau khi đã khởi tạo trong Java?

public class J09ExtendArray {
	public static void main(String[] args) {
		String[] names = new String[] { "A", "B", "C" };
		String[] extended = new String[5];
		extended[3] = "D";
		extended[4] = "E";
		
		//Kế thừa một Mảng (Array) sau khi khởi tạo bằng việc tạo một Mảng (Array) mới trong Java
		System.arraycopy(names, 0, extended, 0, names.length);
		for (String str : extended) {
			System.out.print(str + " ");
		}
	}
}
