package h17jb3.tu4.Opp;
//VỀ TÍNH ĐA HÌNH (lớp Point). Lớp Point cài đặt, hiện thực interface tên shape. Định nghĩa lớp Point trong tập tin Point.java
public class Point2 extends Object implements Shape2 {
	protected int x, y; // Tọa độ x, y của 1 điểm

	public Point2() // constructor không tham số.
	{
		setPoint(0, 0);
	}

	public Point2(int xCoordinate, int yCoordinate) // constructor có tham số.
	{
		setPoint(xCoordinate, yCoordinate);
	}

	public void setPoint(int xCoordinate, int yCoordinate) // gán tọa độ x, y
															// cho 1 điểm
	{
		x = xCoordinate;
		y = yCoordinate;
	}

	// lấy tọa độ x của 1 điểm
	public int getX() {
		return x;
	}

	public int getY() // lấy tọa độ y của 1 điểm
	{
		return y;
	}

	public String toString() // Thể hiện tọa độ của 1 điểm dưới dạng chuỗi
	{
		return "[" + x + ", " + y + "]";
	}

	public double area() // Tính diện tích
	{
		return 0.0;
	}

	public double volume() // Tính thể tích
	{
		return 0.0;
	}

	public String getName() // trả về tên của đối tượng shape
	{
		return "Point";
	}
} // end class Point
