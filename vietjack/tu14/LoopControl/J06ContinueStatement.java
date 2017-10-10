package vietjack.tu14.LoopControl;
//Lệnh continue trong Java

public class J06ContinueStatement {

	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50 };

		//Từ khóa continue có thể được sử dụng trong bất kỳ cấu trúc điều khiển vòng lặp nào. Nó làm cho vòng lặp ngay lập tức tiếp tục tiến trình lặp tiếp theo của vòng lặp.
		for (int x : numbers) {
			if (x == 30) {
				continue;
			}
			System.out.print(x);
			System.out.print("\n");
		}
	}

}
