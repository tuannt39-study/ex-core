package vietjack.tu90.Col.ListInterface;

//List Interface trong Java
//Các phần tử có thể được chèn hoặc được truy cập thông qua vị trí của chúng trong danh sách, bởi sử dụng chỉ mục xây dựng bắt đầu từ 0.
//Một list có thể chứa nhiều bản sao phần tử.
//Ngoài các phương thức được định nghĩa bởi Collection, List Interface định nghĩa một số phương thức riêng, mà được liệt kê trong bảng dưới đây.
//Một số phương thức của List Interface sẽ ném một UnsupportedOperationException nếu collection không thể bị sửa đổi, và ném một ClassCastException nếu một đối tượng là không tương thích với đối tượng khác.
//List Interface trên đã triển khai trong các lớp đa dạng như ArrayList hoặc LinkedList

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class J01ListInterfaceDemo {
	public static void main(String[] args) {
		List<String> a1 = new ArrayList<String>();
		a1.add("Zara");
		a1.add("Mahnaz");
		a1.add("Ayan");
		System.out.println(" Cac phan tu ArrayList");
		System.out.print("\t" + a1);

		List<String> l1 = new LinkedList<String>();
		l1.add("Zara");
		l1.add("Mahnaz");
		l1.add("Ayan");
		System.out.println();
		System.out.println(" Cac phan tu LinkedList");
		System.out.print("\t" + l1);
	}
}
