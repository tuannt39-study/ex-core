package vietjack.tu14.LoopControl;
//Vòng lặp while trong Java

public class J01WhileLoop {

	public static void main(String[] args) {
		int x = 10;

		//Một vòng lặp while là một cấu trúc điều khiển cho phép bạn lặp đi lặp lại một tác vụ một số lần nào đó. Với kiểu vòng lặp này, chương trình sẽ kiểm tra điều kiện trước khi thực thi phần thân vòng lặp.
		while (x < 20) {
			System.out.print("Gia tri cua x : " + x);
			x++;
			System.out.print("\n");
		}
	}

}
