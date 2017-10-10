package vietjack.tu19.Oop.ObjectAndClasses;
//Lớp ClassicSingleton duy trì một tham chiếu static tới singleton bơ vơ và trả về tham chiếu đó từ phương thức static getInstance()
public class J03ClassicSingleton {
	private static J03ClassicSingleton instance = null;

	protected J03ClassicSingleton() {
	   }

	public static J03ClassicSingleton getInstance() {
		if (instance == null) {
			instance = new J03ClassicSingleton();
		}
		return instance;
	}
}
