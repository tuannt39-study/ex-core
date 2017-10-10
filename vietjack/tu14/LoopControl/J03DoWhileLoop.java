package vietjack.tu14.LoopControl;
//Vòng lặp do...while trong Java

public class J03DoWhileLoop {

	public static void main(String[] args) {
		int x = 100;

		//Một vòng lặp do … while là tương tự như vòng lặp while, ngoại trừ rằng phần thân của vòng lặp do…while được bảo đảm thực thi ít nhất một lần. Nói cách khác, vòng lặp do ... while thực hiện phần thân vòng lặp trước khi kiểm tra điều kiện.
		do {
			System.out.print("Gia tri cua x : " + x);
			x++;
			System.out.print("\n");
		} while (x < 20);
	}

}
