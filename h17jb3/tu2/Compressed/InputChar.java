package h17jb3.tu2.Compressed;
//Nhập ký tự từ bàn phím

public class InputChar {
	public static void main(String args[]) {
		char ch = ' ';
		System.out.print("Nhập: ");
		try {
			ch = (char) System.in.read();
		} catch (Exception e) {
			System.out.println("Nhập lỗi!");
		}
		System.out.println("Ky tu vua nhap: " + ch);
	}
}
