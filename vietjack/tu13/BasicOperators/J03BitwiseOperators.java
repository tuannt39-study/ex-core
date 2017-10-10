package vietjack.tu13.BasicOperators;
//Ví dụ toán tử thao tác bit trong Java

public class J03BitwiseOperators {

	public static void main(String[] args) {
		int a = 60; /* 60 = 0011 1100 */
		int b = 13; /* 13 = 0000 1101 */
		int c = 0;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

		//Toán tử Và nhị phân sao chép một bit tới kết quả nếu nó tồn tại trong cả hai toán hạng	
		c = a & b; /* 12 = 0000 1100 */
		System.out.println("a & b = " + c);

		//Toán tử Hoặc nhị phân sao chép một bit tới kết quả nếu nó tồn tại trong một hoặc hai toán hạng	
		c = a | b; /* 61 = 0011 1101 */
		System.out.println("a | b = " + c);

		//Toán tử Hoặc loại trừ nhị phân sao chép bit nếu nó được thiết lập trong một toán hạng nhưng không phải trong cả hai	
		c = a ^ b; /* 49 = 0011 0001 */
		System.out.println("a ^ b = " + c);

		//Toán tử đảo bit là toán tử một ngôi. Đảo bít 1 thành 0 và ngược lại	
		c = ~a; /*-61 = 1100 0011 */
		System.out.println("~a = " + c);

		//Toán tử dịch trái. Giá trị toán hạng trái được dịch chuyển sang trái bởi số các bit được xác định bởi toán hạng bên phải.	
		c = a << 2; /* 240 = 1111 0000 */
		System.out.println("a << 2 = " + c);

		//Toán tử dịch phải. Giá trị toán hạng trái được dịch chuyển sang phải bởi số các bit được xác định bởi toán hạng bên phải	
		c = a >> 2; /* 215 = 1111 */
		System.out.println("a >> 2  = " + c);

		//Toán tử dịch phải và điền 0 vào chỗ trống	
		c = a >>> 2; /* 215 = 0000 1111 */
		System.out.println("a >>> 2 = " + c);
	}

}
