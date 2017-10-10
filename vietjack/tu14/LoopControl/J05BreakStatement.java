package vietjack.tu14.LoopControl;
//Lệnh break trong Java

public class J05BreakStatement {

	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50 };

		//Từ khóa break được sử dụng để dừng toàn bộ vòng lặp. Từ khóa break phải được sử dụng bên trong bất kỳ vòng lặp nào hoặc một lệnh switch.
		for (int x : numbers) {
			if (x == 30) {
				break;
			}
			System.out.print(x);
			System.out.print("\n");
		}
	}

}
