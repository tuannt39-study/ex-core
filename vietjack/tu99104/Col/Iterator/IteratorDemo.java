package vietjack.tu99104.Col.Iterator;

//Sử dụng Iterator trong Java
//Thường thì, bạn sẽ muốn tuần hoàn qua các phần tử trong một tập hợp. Ví dụ, bạn có thể muốn hiển thị mỗi phần tử.
//Cách đơn giản nhất để thực hiện điều này là thuê một Iterator, là một đối tượng mà triển khai hoặc Iterator hoặc Listlerator interface.
//Iterator cho bạn khả năng để tuần hoàn qua một tập hợp, kiếm được và gỡ bỏ các phần tử. ListIterator kế thừa Iterator để cho phép "vọc" song hướng một danh sách và sửa đổi các phần tử.
//Trước khi bạn có thể truy cập một Collection thông qua một Iterator, bạn phải có được nó. Mỗi lớp Collection cung cấp một phương thức iterator() mà trả về một iterator tới phần bắt đầu của Collection. Bởi sử dụng đối tượng Iterator, bạn có thể truy cập mỗi phần tử trong Collection, từng phần tử một tại một thời điểm.
//Sau đây là ví dụ minh họa cả Iterator và ListIterator. Nó sử dụng một đối tượng ArrayList, nhưng các qui tắc chung áp dụng tới bất kỳ kiểu Collection nào.
//Tất nhiên, ListIterator chỉ có sẵn cho các Collection mà triển khai List Interface trong Java

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
	public static void main(String args[]) {
		// Tao mot array list
		ArrayList<String> al = new ArrayList<String>();
		// them cac phan tu toi array list
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");

		// Su dung iterator de hien thi noi dung cua array list
		System.out.print("Noi dung ban dau cua ArrayList la: \n");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			Object element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();

		// Sua doi cac doi tuong sau khi da duoc lap qua
		ListIterator<String> litr = al.listIterator();
		while (litr.hasNext()) {
			Object element = litr.next();
			litr.set(element + "+");
		}
		System.out.print("Noi dung sau khi sua doi cua ArrayList la: \n");
		itr = al.iterator();
		while (itr.hasNext()) {
			Object element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();

		// Bay gio, hien thi list theo chieu nguoc lai
		System.out.print("Hien thi list theo chieu nguoc lai: \n");
		while (litr.hasPrevious()) {
			Object element = litr.previous();
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
