package vietjack.tu91.Col.SetInterface;

//Set Interface trong Java
//Set Interface trong Java là một Collection mà không chứa các bản sao phần tử.
//Set Interface trong Java chỉ chứa các phương thức được kế thừa từ Collection và thêm sự giới hạn về việc ngăn cấm các phần tử bản sao.
//Set Interface cũng thêm các hoạt động hashCode cho phép Set Interface so sánh một cách có ý nghĩa ngay cả khi kiểu triển khai của nó là khác.
//Set Interface có sự triển khai trong các lớp đa dạng như HashSet, TreeSet, LinkedHashSet

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class J01SetDemo {
	public static void main(String args[]) {
		int count[] = { 34, 22, 10, 60, 10, 30, 22 };
		Set<Integer> set = new HashSet<Integer>();
		try {
			for (int i = 0; i < 7; i++) {
				set.add(count[i]);
			}
			System.out.println(set);

			TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
			System.out.println("Danh sach da qua sap xep la:");
			System.out.println(sortedSet);

			System.out.println("Phan tu dau tien cua tap hop la: " + (Integer) sortedSet.first());
			System.out.println("Phan tu cuoi cung cua tap hop la: " + (Integer) sortedSet.last());
		} catch (Exception e) {
		}
	}
}
