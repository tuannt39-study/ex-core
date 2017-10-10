package vietjack.ex.j03arrays;

//Cách sắp xếp một Mảng (Array) và chèn một phần tử vào Mảng (Array) trong Java?

import java.util.Arrays;

public class J02InsertElement {
	public static void main(String args[]) throws Exception {
		int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		
		//Xếp thứ tự mảng các đối tượng đã cho theo thứ tự tăng dần, theo thứ tự tự nhiên của các phần tử.
		//Phương thức tương tự có thể được sử dụng bởi tất cả kiểu dữ liệu gốc khác (byte, short, int, …).
		Arrays.sort(array);
		printArray("Sorted array", array);
		
		//Tìm kiếm mảng của Object (byte, int, double, …) đã cho với giá trị đã xác định bởi sử dụng thuật toán tìm kiếm nhị phân.
		//Mảng này phải được xếp thứ tự trước khi gọi phương thức này.
		//Nó trả về chỉ mục của từ khóa tìm kiếm, nếu nó nằm trong danh sách, nếu không thì, bằng (-(điểm chèn + 1)).
		int index = Arrays.binarySearch(array, 1);
		System.out.println("Didn't find 1 @ " + index);
		int newIndex = -index - 1;
		array = insertElement(array, 1, newIndex);
		printArray("With 1 added", array);
	}

	private static void printArray(String message, int array[]) {
		System.out.println(message + ": [length: " + array.length + "]");
		for (int i = 0; i < array.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}

	private static int[] insertElement(int original[], int element, int index) {
		int length = original.length;
		int destination[] = new int[length + 1];
		System.arraycopy(original, 0, destination, 0, index);
		destination[index] = element;
		System.arraycopy(original, index, destination, index + 1, length - index);
		return destination;
	}
}
