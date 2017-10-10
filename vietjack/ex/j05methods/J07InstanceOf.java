package vietjack.ex.j05methods;

//Cách hiển thị lớp Object bởi sử dụng từ khóa instanceOf trong Java?
//Phương thức displayObjectClass()trong Java để hiển thị lớp Object mà đã được truyền trong phương thức này

import java.util.ArrayList;
import java.util.Vector;

public class J07InstanceOf {
	public static void main(String[] args) {
		Object testObject = new ArrayList<Object>();
		displayObjectClass(testObject);
	}

	public static void displayObjectClass(Object o) {
		if (o instanceof Vector)
			System.out.println("Object was an instance  of the class java.util.Vector");
		else if (o instanceof ArrayList)
			System.out.println("Object was an instance of  the class java.util.ArrayList");
		else
			System.out.println("Object was an instance of the " + o.getClass());
	}
}
