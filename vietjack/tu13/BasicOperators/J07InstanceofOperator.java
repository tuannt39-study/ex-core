package vietjack.tu13.BasicOperators;
//Toán tử instanceof trong Java

public class J07InstanceofOperator {

	public static void main(String[] args) {
		String name = "Doan";
		
		// Toán tử trả về true nếu toán hạng trái là biến thể hiện của toán hạng phải. Duoi day se tra ve true neu name la mot kieu String
		boolean result = name instanceof String;
		System.out.println(result);
	}

}

//class Animal {}
//
//public class J07InstanceofOperator extends Animal {
//   public static void main(String args[]){
//      Animal a = new J07InstanceofOperator();
//      boolean result =  a instanceof J07InstanceofOperator;
//      System.out.println( result );
//   }
//}