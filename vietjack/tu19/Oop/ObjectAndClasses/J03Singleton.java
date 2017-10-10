package vietjack.tu19.Oop.ObjectAndClasses;
//Lớp Singleton trong Java
//Mục đích của Singleton là để kiểm soát việc tạo ra đối tượng, giới hạn số lượng đối tượng tạo ra là chỉ một. Giống như các trường static, chỉ có một trường Singleton xuất hiện cho mỗi lớp. Các Singleton thường kiểm soát sự truy cập tới nguồn như kết nối database hoặc socket.

public class J03Singleton {

	private static J03Singleton singleton = new J03Singleton();

	/*
	 * Mot private Constructor de ngan can bat cu lop nao khac khoi tao.
	 */
	private J03Singleton() {
	}

	/* Phuong thuc static 'instance' */
	public static J03Singleton getInstance() {
		return singleton;
	}

	/* Cac phuong thuc protected khac */
	protected static void demoMethod() {
		System.out.println("demoMethod cho singleton");
	}

}
