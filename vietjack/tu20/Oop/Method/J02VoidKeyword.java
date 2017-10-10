package vietjack.tu20.Oop.Method;

public class J02VoidKeyword {
	public static void main(String[] args) {
		methodRankPoints(125.7);
	}

	public static void methodRankPoints(double points) {
		if (points >= 202.5) {
			System.out.println("Rank:A1");
		} else if (points <= 122.4) {
			System.out.println("Rank:A3");
		} else {
			System.out.println("Rank:A2");
		}
	}
}
