package h17jb3.tu4.Opp;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachNhanVienBai2 {
	private ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
	private int soLuongNV;
	private long tongLuong;
	
	public void add(NhanVien nv){
		dsnv.add(nv);
		this.tongLuong = tongLuong + nv.getLuong();
		//this.soLuongNV = this.soLuongNV + 1;
		this.soLuongNV = this.dsnv.size();
	}
	
	public void addFromType(){
		NhanVien nv = new NhanVien();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma nhan vien: ");
		nv.setMaNV(sc.nextLine().toString());
		System.out.println("Nhap so san pham: ");
		nv.setSoSP(sc.nextInt());
		
		this.add(nv);
		
	}
	
	public int spMin(){
		int min=this.dsnv.get(0).getSoSP();
		for (NhanVien nv: this.dsnv){
			if (min>nv.getSoSP()){
				min=nv.getSoSP();
			}
		}
		return min;
	}
	
	public long luongMax(){
		long max=this.dsnv.get(0).getLuong();
		for (NhanVien nv: this.dsnv){
			if (max<nv.getLuong()){
				max=nv.getLuong();
			}
		}
		return max;
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
