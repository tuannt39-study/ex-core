package h17jb3.tu5.Exceptions;
//MỘT SỐ LỚP NGOẠI LỆ

public class ClassExceptions {
}
//	1-Object
//	1.1-Throwable
//	1.1.1-Error
//	1.1.1.1-AssertionError
//	1.1.2-Exception
//	1.1.2.1-RuntimeException
//	1.1.2.1.1-NullPointerException
//	1.1.2.1.2-ArithmeticException
//	1.1.2.2-IOException 
//	1.1.2.3-ClassNotFoundException
	
//	Lớp Throwable
//	• Có một biến String để lưu thông tin chi tiết về ngoại lệ đã xảy ra
//	• Một số phương thức cơ bản
//	• Throwable(String s); // Tạo một ngoại lệ có tên là s.
//	• String getMessage(); // Lấy thông tin về ngoại lệ
//	• void printStackTrace(); // In ra tất cả các thông tin liên quan đến ngoại lệ
//	
//	Lớp Exception
//	• Có nhiều ngoại lệ thuộc lớp con của Exception.
//	• Người dùng có thể tạo ra các ngoại lệ kế thừa từ Exception.
//	•
//	Lớp Error
//	• Chỉ những lỗi nghiêm trọng và không dự đoán trước được như
//	ThreadDead, LinkageError, VirtualMachineError...
//	• Các ngoại lệ kiểu Error ít được xử lý.
//	
//	RuntimeException: Chỉ các ngoại lệ có thể xảy
//	ra khi JVM thực thi chương trình
//	• NullPointException: con trỏ null
//	• OutOfMemoryException: hết bộ nhớ
//	• ArithmeticException: lỗi toán học, lỗi chia không...
//	• ClassCastException: lỗi ép kiểu
//	• ArrayIndexOutOfBoundsException: vượt quá chỉ số mảng

//	HAI LOẠI NGOẠI LỆ
//	• Ngoại lệ unchecked
//	• Là các ngoại lệ không bắt buộc phải được kiểm tra.
//	• Gồm RuntimeException, Error và các lớp con của chúng.
//	• Ngoại lệ checked
//	• Là các ngoại lệ bắt buộc phải được kiểm tra.
//	• Gồm các ngoại lệ còn lại.
	
//	CHÚ Ý VỚI NGOẠI LỆ CHECKED
//	• Giả sử method1 gọi method2 và method2 là phương thức có khả
//	năng ném ngoại lệ kiểu checked, lúc đó:
//	• hoặc method2 phải nằm trong khối try/catch.
//	• hoặc phải khai báo method1 có khả năng ném (throws) ngoại lệ.
	
//	VÍ DỤ: NGOẠI LỆ IOEXCEPTION
//	• Cách 1: try/catch
//	public static void main(String[] args) {
//		try {
//			String s = buff.readLine();
//		} catch (IOException e) {
//			...
//		}
//	}
//	• Cách 2: Khai báo throws
//	public static void main(String[] args) throws IOException {
//		String s = buff.readLine();
//	}
//	
//	TẠO RA NGOẠI LỆ
//	• Các ngoại lệ được định nghĩa với lệnh ‘throw’ và ‘throws’
//	• Các ngoại lệ thì được chặn với sự trợ giúp của từ khóa
//	‘throw’
//	• Từ khóa ‘throw’ chỉ ra một ngoại lệ vừa xảy ra.
//	• Toán hạng của throw là một đối tượng của một lớp, mà
//	lớp này được dẫn xuất từ lớp ‘Throwable’
//	• Ví dụ của lệnh ‘throw’
//	try{
//		if (flag < 0) {
//			throw new MyException( ) ; // user-defined
//		}
//	}
	
//	TẠO RA NGOẠI LỆ
//	• Một phương thức đơn có thể chặn nhiều hơn một
//	ngoại lệ
//	• Ví dụ từ khóa ‘throw’ xử lý nhiều ngoại lệ
//	public class Example {
//		public void exceptionExample( ) throws ExException, LookupException {
//			try { 
//				// statements }
//			} catch (ExException exmp) { 
//				.... 
//			}
//			catch (LookupException lkpex) { 
//				.... 
//			}
//		}
//	}
	
//	NGOẠI LỆ DO NGƯỜI DÙNG TẠO
//	• Định nghĩa lớp ngoại lệ
//	// file MyException.java
//	public class MyException extends Exception {
//		public MyException(String msg) {
//			super(msg);
//		}
//	}
	
//	Sử dụng ngoại lệ
//	// file ExampleException.java
//	public class ExampleException {
//		public void copy(String fileName1, String fileName2) throws MyException {
//			if (fileName1.equals(fileName2))
//				throw new MyException("File trung ten"); // tung ngoại lệ
//			System.out.println("Copy completed");
//		}
//	}
	
//	public static void main(String[] args) {
//		ExampleException obj = new ExampleException();
//		try {
//			String a = args[0];
//			String b = args[1];
//			obj.copy(a,b);
//		} catch (MyException e) {
//			System.out.println(e.getMessage());
//		}
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
