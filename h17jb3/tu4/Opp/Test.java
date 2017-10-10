package h17jb3.tu4.Opp;
//VỀ TÍNH ĐA HÌNH (test), dùng để kiểm tra tính kế thừa của Point, Circle, Cylinder với lớp trừu tượng Shape.

import java.text.DecimalFormat;

public class Test {// Kiểm tra tính kế thừa của các đối tượng hình học
	public static void main(String args[]) { // Tạo ra các đối tượng hìnhhọc
		Point point = new Point(7, 11);
		Circle circle = new Circle(3.5, 22, 8);
		Cylinder cylinder = new Cylinder(10, 3.3, 10, 10);
		// Tạo một mảng các đối tượng hình học
		Shape arrayOfShapes[] = new Shape[3];
		// arrayOfShapes[ 0 ] là một đối tượng Point
		arrayOfShapes[0] = point;
		// arrayOfShapes[ 1 ] là một đối tượng Circle
		arrayOfShapes[1] = circle;
		// arrayOfShapes[ 2 ] là một đối tượng cylinder
		arrayOfShapes[2] = cylinder;
		// Lấy tên và biểu diễn của mỗi đối tượng hình học
		String output = point.getName() + ": " + point.toString() + "\n" + circle.getName() + ": " + circle.toString()
				+ "\n" + cylinder.getName() + ": " + cylinder.toString();
		DecimalFormat precision2 = new DecimalFormat("0.00");
		// duyệt mảng arrayOfShapes lấy tên, diện tích, thể tích
		// của mỗi đối tượng hình học trong mảng.
		for (int i = 0; i < arrayOfShapes.length; i++) {
			output += "\n\n" + arrayOfShapes[i].getName() + ": " + arrayOfShapes[i].toString() + "\n Area = "
					+ precision2.format(arrayOfShapes[i].area()) + "\nVolume = "
					+ precision2.format(arrayOfShapes[i].volume());
		}
		System.out.println(output);
		System.exit(0);
	}
} // end class Test