package h17jb3.tu4.Opp;

import java.util.ArrayList;

public class DanhSachNhanVien {
	private ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
	private int soLuongNV;
	private long tongLuong;
	
	public void add(NhanVien nv){
		dsnv.add(nv);
		this.tongLuong = tongLuong + nv.getLuong();
		//this.soLuongNV = this.soLuongNV + 1;
		this.soLuongNV = this.dsnv.size();
	}
	
	public void show(){
		for (NhanVien nv: this.dsnv){
			nv.show();
		}
		System.out.println("Số lượng nhân viên: " + this.soLuongNV);
		System.out.println("Lương: " + this.tongLuong);
	}
	
	public ArrayList<NhanVien> getDsnv() {
		return dsnv;
	}
	public void setDsnv(ArrayList<NhanVien> dsnv) {
		this.dsnv = dsnv;
	}
	public int getSoLuongNV() {
		return soLuongNV;
	}
	public void setSoLuongNV(int soLuongNV) {
		this.soLuongNV = soLuongNV;
	}
	public long getTongLuong() {
		return tongLuong;
	}
	public void setTongLuong(long tongLuong) {
		this.tongLuong = tongLuong;
	}
	
}
