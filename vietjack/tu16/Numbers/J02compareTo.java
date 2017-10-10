package vietjack.tu16.Numbers;
//Number compareTo() trong Java

public class J02compareTo {

	public static void main(String[] args) {
		Integer x = 5;
		
		//So sánh đối tượng Number này với tham số. Nó là có thể so sánh với Byte, Long, Integer, etc.
		//Nếu Integer cân bằng với tham số thì trả về 0.
		//Nếu Integer nhỏ hơn tham số thì trả về -1.
		//Nếu Integer lớn hơn tham số thì trả về 1.
		System.out.println("x = " + x);
		System.out.println(x.compareTo(3));
		System.out.println(x.compareTo(5));
		System.out.println(x.compareTo(8));
	}

}
