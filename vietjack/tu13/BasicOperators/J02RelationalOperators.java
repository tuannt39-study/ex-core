package vietjack.tu13.BasicOperators;
//Ví dụ toán tử quan hệ trong Java

public class J02RelationalOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		//Kiểm tra nếu giá trị của hai toán hạng có cân bằng hay không, nếu có thì điều kiện là true.	
		System.out.println("a == b = " + (a == b));
		
		//Kiểm tra nếu giá trị hai toán hạng là cân bằng hay không, nếu không cân bằng, thì điều kiện là true	
		System.out.println("a != b = " + (a != b));
		
		//Kiểm tra nếu toán hạng trái có lớn hơn toán hạng phải hay không, nếu có thì điều kiện là true	
		System.out.println("a > b = " + (a > b));
		
		//Kiểm tra nếu toán hạng phải có lớn hơn toán hạng trái hay không, nếu có thì điều kiện là true	
		System.out.println("a < b = " + (a < b));
		
		//Kiểm tra nếu toán hạng trái có lớn hơn hoặc bằng toán hạng phải hay không, nếu có thì điều kiện là true	
		System.out.println("b >= a = " + (b >= a));
		
		//Kiểm tra nếu toán hạng phải có lớn hơn hoặc bằng toán hạng trái hay không, nếu có thì điều kiện là true	
		System.out.println("b <= a = " + (b <= a));
	}

}
