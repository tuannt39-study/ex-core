package vietjack.tu34.Oop.InstanceOf;

//Toán tử instanceof với bất cứ biến nào mà có giá trị null, thì nó trả về false

public class J03Dog {
	public static void main(String args[]) {
		J03Dog d = null;
		System.out.println(d instanceof J03Dog);// false
	}
}
