package vietjack.tu13.BasicOperators;
//Ví dụ toán tử logic trong Java

public class J04LogicalOperators {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;

		//Toán tử Và logic. Nếu cả hai toán hạng là khác không, thì khi đó điều kiện là true	
		System.out.println("a && b = " + (a && b));
		
		//Toán tử Hoặc logic. Nếu một trong hai toán tử khác 0, thì điều kiện là true	
		System.out.println("a || b = " + (a || b));
		
		//Toán tử Phủ định logic. Sử dụng để đảo ngược lại trạng thái logic của toán hạng đó. Nếu điều kiện toán hạng là true thì phủ định nó sẽ là false	
		System.out.println("!(a && b) = " + !(a && b));
	}

}
