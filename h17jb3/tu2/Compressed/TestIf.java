package h17jb3.tu2.Compressed;
//Mệnh đề if/else

import java.util.Date;

public class TestIf {
	public static void main( String args[ ] ) {
		Date today = new Date();
		if( today.getDay() == 0 ) {
			System.out.println("Hom nay la chu nhat\n");
		} else {
			System.out.println("Hom nay khong la chu nhat\n");
		}
	}
}
