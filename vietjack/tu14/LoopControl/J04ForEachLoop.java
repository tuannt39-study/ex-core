package vietjack.tu14.LoopControl;

public class J04ForEachLoop {

	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50 };

		//Trong Java 5, vòng lặp foreach (một tên gọi khác là enhanced for) đã được giới thiệu. Nó được sử dụng chủ yếu với các mảng, các ArrayList, ...
		for (int x : numbers) {
			System.out.print(x + ", ");
		}
		System.out.print("\n");
		String[] names = { "James", "Larry", "Tom", "Lacy" };
		for (String name : names) {
			System.out.print(name + ", ");
		}
	}

}
