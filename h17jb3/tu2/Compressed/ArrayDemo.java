package h17jb3.tu2.Compressed;
//Nhập và xuất giá trị các phần tử của một mảng các số nguyên

public class ArrayDemo {
	public static void main(String args[]) {
		int arrInt[] = new int[10];
		int i;
		for (i = 0; i < 10; i = i + 1)
			arrInt[i] = i;
		for (i = 0; i < 10; i = i + 1)
			System.out.println("This is arrInt[" + i + "]: " + arrInt[i]);
	}
}
