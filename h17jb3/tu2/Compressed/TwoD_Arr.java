package h17jb3.tu2.Compressed;
//Nhập và xuất giá trị của các phần tử trong một mảng hai chiều

public class TwoD_Arr {
	public static void main(String args[]) {
		int t, i;
		int table[][] = new int[3][4];
		for (t = 0; t < 3; ++t) {
			for (i = 0; i < 4; ++i) {
				table[t][i] = (t * 4) + i + 1;
				System.out.print(table[t][i] + " ");
			}
			System.out.println();
		}
	}
}
