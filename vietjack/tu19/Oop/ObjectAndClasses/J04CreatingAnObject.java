package vietjack.tu19.Oop.ObjectAndClasses;
//Khai báo: Một khai báo biến với một tên biến với một loại đối tượng. Cài đặt: Từ khóa new được sử dụng để tạo đối tượng. Khởi tạo: Từ khóa new được theo sau bởi một lời gọi một constructor. Gọi hàm này khởi tạo đối tượng mới

public class J04CreatingAnObject {
	public J04CreatingAnObject(String ten) {
		// Contructor nay co mot tham so la ten.
		System.out.println("Ten xe la :" + ten);
	}

	public static void main(String[] args) {
		// Lenh sau se tao mot doi tuong la Xecuatoi
		J04CreatingAnObject Xecuatoi = new J04CreatingAnObject("Toyota");
	}
}
