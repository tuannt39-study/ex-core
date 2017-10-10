package h17jb3.tu4.Opp;
///VỀ TÍNH ĐA HÌNH (lớp Circle). Lớp Circle là lớp con của lớp Point, và cài đặt/hiện thực gián tiếp interface tên shape. Định nghĩa lớp Circle
public class Circle2 implements Shape2 {// Dẫn xuất từ lớpPoint
	protected double radius;

	public Circle2() // constructor không tham số
	{
		// ngầm gọi đến constructor của lớp cha
		setRadius(0);
	}

	// constructor có tham số
	public Circle2(double circleRadius, int xCoordinate, int yCoordinate) {
		// gọi constructorcủa lớp cha
		super( );
		setRadius(circleRadius);
	}

	public void setRadius(double circleRadius) // Gán bán kính của đường tròn
	{
		radius = (circleRadius >= 0 ? circleRadius : 0);
	}

	public double getRadius() // Lấy bán kính của đường tròn
	{
		return radius;
	}

	public double area() // Tính diện tích đường tròn Circle
	{
		return Math.PI * radius * radius;
	}

	public String toString() // Biểu diễn đường tròn bằng một chuỗi
	{
		return "Center = " + super.toString() + "; Radius = " + radius;
	}

	// trả về tên của shape
	public String getName() {
		return "Circle";
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}
} // end class Circle
