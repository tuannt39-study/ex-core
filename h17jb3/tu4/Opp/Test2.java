package h17jb3.tu4.Opp;

import java.text.DecimalFormat;

public class Test2 {// Kiểm tra tính kế thừa của các đối tượng hình học
	public static void main(String args[]) {
		// Tạo ra các đối tượng hìnhhọc
		Point2 point2 = new Point2(7, 11);
		Circle2 circle2 = new Circle2(3.5, 22, 8);
		Cylinder2 cylinder2 = new Cylinder2(10, 3.3, 10, 10);
		Shape2 arrayOfShapes2[] = new Shape2[3]; // Tạo một mảng các đối tượng
													// hình học
		// arrayOfShapes[ 0 ] là một đối tượng Point
		arrayOfShapes2[0] = point2;
		arrayOfShapes2[1] = circle2; // arrayOfShapes[ 1 ] là một đối tượng
										// Circle
		arrayOfShapes2[2] = cylinder2; // arrayOfShapes[ 2 ] là một đối tượng
										// cylinder
		// Lấy tên và biểu diễn của mỗi đối tượng hình học
		String output = point2.getName() + ": " + point2.toString() + "\n" + circle2.getName() + ": "
				+ circle2.toString() + "\n" + cylinder2.getName() + ": " + cylinder2.toString();
		DecimalFormat precision2 = new DecimalFormat("0.00");
		// duyệt mảng arrayOfShapes lấy tên, diện tích, thể tích
		// của mỗi đối tượng hình học trong mảng.
		for (int i = 0; i < arrayOfShapes2.length; i++) {
			output += "\n\n" + arrayOfShapes2[i].getName() + ": " + arrayOfShapes2[i].toString() + "\n Area = "
					+ precision2.format(arrayOfShapes2[i].area()) + "\nVolume = "
					+ precision2.format(arrayOfShapes2[i].volume());
		}
		System.out.println(output);
		System.exit(0);
	}
} // end class Test