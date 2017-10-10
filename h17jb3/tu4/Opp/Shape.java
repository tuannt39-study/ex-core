package h17jb3.tu4.Opp;
//minh họa tính đa hình (polymorphism) - lớp Shape

public abstract class Shape extends Object {
	// trả về diện tích của một đối tượng hình học shape
	public double area() {
		return 0.0;
	}

	// trả về thể tích của một đối tượng hình học shape
	public double volume() {
		return 0.0;
	}

	// Phương thức trừu tượng cần phải được hiện thực
	// trong những lớp con để trả về tên đối tượng
	// hình học shape thích hợp
	public abstract String getName();
	
} // end class Shape