package vietjack.ex.j03arrays;

//Cách ghi một Mảng (Array) các chuỗi tới output console trong Java?

public class J05WriteArray {
	public static void main(String[] args) {
		String[] greeting = new String[3];
		greeting[0] = "This is the greeting";
		greeting[1] = "for all the readers from";
		greeting[2] = "Java Source .";
		
		//Cách ghi các phần tử của một Mảng (Array) tới output console thông qua vòng lặp trong Java
		for (int i = 0; i < greeting.length; i++) {
			System.out.println(greeting[i]);
		}
	}
}
