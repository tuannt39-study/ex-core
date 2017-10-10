package vietjack.tu11.VariableTypes;
//Các biến Class/static trong Java:

public class J03StaticVariables {
	private static double hocphi;
	public static final String FACULTY = "Khoa Công Nghệ Thông Tin";

	public static void main(String[] args) {
		hocphi = 5000;
		System.out.println(FACULTY + " học phí là : " + hocphi);
	}

}
