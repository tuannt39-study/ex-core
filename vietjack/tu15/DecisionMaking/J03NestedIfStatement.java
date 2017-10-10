package vietjack.tu15.DecisionMaking;

public class J03NestedIfStatement {

	public static void main(String[] args) {
		int x = 30;
		int y = 10;

		//Nó là hợp lệ để lồng các lệnh if-else, nghĩa là bạn có thể sử dụng một lệnh if hoặc else if bên trong lệnh if hoặc else if khác.
		if (x == 30) {
			if (y == 10) {
				System.out.print("X = 30 va Y = 10");
			}
		}
	}

}
