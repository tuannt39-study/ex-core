package vietjack.ex.j05methods;

//Cách sử dụng enum constructor, biến instance và phương thức trong Java?

enum Car12 {
	lamborghini(900), tata(2), audi(50), fiat(15), honda(12);
	private int price;

	Car12(int p) {
		price = p;
	}

	int getPrice() {
		return price;
	}
}

public class J12EnumConstructor {
	public static void main(String args[]) {
		System.out.println("All car prices:");
		for (Car12 c : Car12.values())
			System.out.println(c + " costs " + c.getPrice() + " thousand dollars.");
	}
}