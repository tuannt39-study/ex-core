package vietjack.tu81.Data.Enum;

//Enum trong Java
//Liệt kê (từng phần tử tại một thời điểm) các phần tử trong một tập hợp các đối tượng.
//Interface này kế thừa từ Iterator. Mặc dù không bị deprecated (đánh dấu phương thức của phiên bản cũ), nhưng Enumeration được xem như là đã cũ so với hệ thống code mới bây giờ.

import java.util.Enumeration;
import java.util.Vector;

public class J01Enemeration {
	public static void main(String args[]) {
		Enumeration<String> days;
		Vector<String> dayNames = new Vector<String>();
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		days = dayNames.elements();
		while (days.hasMoreElements()) {
			System.out.println(days.nextElement());
		}
	}
}
