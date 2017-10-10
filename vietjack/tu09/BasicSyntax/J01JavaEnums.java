package vietjack.tu09.BasicSyntax;
//Java Enums

class FreshJuice {

	enum FreshJuiceSize {
		SMALL, MEDIUM, LARGE
	}

	FreshJuiceSize size;
}

public class J01JavaEnums {

	public static void main(String[] args) {
		FreshJuice juice = new FreshJuice();
		juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
		System.out.println("Size: " + juice.size);
	}

}
