package h17jb3.tu5.Exceptions;
//VÍ DỤ 1

import h17jb3.tu4.Opp.Point;

public class MyArray {
	public static void main(String[] args) {
		System.out.println("Goi phuong thuc methodeX() ");
		methodeX();
		System.out.println("Chuong trinh ket thuc binh thuong");
	}

	public static void methodeX() {
		Point[] pts = new Point[10];

//		for (int i = 0; i < pts.length; i++) {
//			pts[i].x = i;
//			pts[i].y = i + 1;
//		}
	}

}
// Giải thích: Hệ thống đã tung ra một exception thuộc lớp. NullPointerException
// khi gặp lỗi. Sau đó chương trình kết thúc.
