package thantrieu.ex1;

//Nhập “DiemHocSinh Java” thì khi xuất ra màn hình ta sẽ đc dòng chữ DiemHocSinh Java
import java.util.Scanner;

public class B01 {
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		System.out.println("Nội dung vừa nhập là:\n" + str);
	}
}
