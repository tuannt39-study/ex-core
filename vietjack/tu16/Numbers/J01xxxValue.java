package vietjack.tu16.Numbers;
//xxxValue() trong Java - Các phương thức của lớp Number trong Java

public class J01xxxValue {

	public static void main(String[] args) {
		Integer x = 5;

		//Biến đổi giá trị của đối tượng Number này thành kiểu dữ liệu xxx mà được trả về từ phương thức
		System.out.println("x = " + x);
		System.out.println(x.byteValue());
		System.out.println(x.doubleValue());
		System.out.println(x.longValue());

	}

}
