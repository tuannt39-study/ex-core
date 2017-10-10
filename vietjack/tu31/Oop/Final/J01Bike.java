package vietjack.tu31.Oop.Final;

//Giả sử có một biến final có tên là speedlimit, chúng ta đang thay đổi giá trị của biến này
//Nhưng nó không thể bị thay đổi bởi vì một khi biến final đã được gán giá trị thì không bao giờ bị thay đổi.

public class J01Bike {
	final int speedlimit = 90;// bien final

	void run() {
//		speedlimit = 400; //Không thể thực hiện được.
	}

	public static void main(String args[]) {
		J01Bike obj = new J01Bike();
		obj.run();
	}
}
