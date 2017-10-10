package vietjack.tu11.VariableTypes;
//Thuộc tính (hay biến instance) trong Java

public class J02InstanceVariables {
	public String ten;
	private double hocphi;

	public J02InstanceVariables(String tenSV) {
		ten = tenSV;
	}

	public void setHocPhi(double hp) {
		hocphi = hp;
	}

	public void inThongTin() {
		System.out.println("Họ tên: " + ten);
		System.out.println("Học phí: " + hocphi);
	}

	public static void main(String[] args) {
		J02InstanceVariables sv = new J02InstanceVariables("Nguyễn Thế Tuân");
		sv.setHocPhi(5000);
		sv.inThongTin();
	}

}
