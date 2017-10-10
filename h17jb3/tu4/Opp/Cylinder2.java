package h17jb3.tu4.Opp;

//VỀ TÍNH ĐA HÌNH (lớp Cylinder). Định nghĩa lớp hình trụ Cylinder trong tập tin Cylinder.java.
public class Cylinder2 extends Circle2 {
	protected double height; // chiều cao của Cylinder

	public Cylinder2() // constructor không có tham số
	{
		// ngầm gọi đến constructor của lớp cha
		setHeight(0);
	}

	// constructor có tham số
	public Cylinder2(double cylinderHeight, double cylinderRadius, int xCoordinate, int yCoordinate) {
		// Gọi constructor của lớp cha
		super(cylinderRadius, xCoordinate, yCoordinate);
		setHeight(cylinderHeight);
	}

	public void setHeight(double cylinderHeight) // Gán chiều cao cho Cylinder
	{
		height = (cylinderHeight >= 0 ? cylinderHeight : 0);
	}

	public double getHeight() // Lấy chiều cao của Cylinder
	{
		return height;
	}

	public double area() // Tính diện tích xung quanh của Cylinder
	{
		return 2 * super.area() + 2 * Math.PI * radius * height;
	}

	public double volume() // Tính thể tích của Cylinder
	{
		return super.area() * height;
	}

	public String toString() // Biểu diễn Cylinder bằng một chuỗi
	{
		return super.toString() + "; Height = " + height;
	}

	// trả về tên của shape
	public String getName() {
		return "Cylinder";
	}
} // end class Cylinder