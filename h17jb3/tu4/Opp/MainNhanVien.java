package h17jb3.tu4.Opp;

public class MainNhanVien {
	public static void main(String[] args) {
		NhanVien n1 = new NhanVien();
		NhanVien n2 = new NhanVien("NV002", 2);
		NhanVien n3 = new NhanVien("NV003", "Nguyen The Tuan", 3);
		NhanVien n4 = new NhanVien("NV004", "Nguyen The Tuan", 4, 4000);
		NhanVien n5 = new NhanVien("NV005", "Nguyen The Tuan", 5, 5000);
		
		DanhSachNhanVienBai2 ds = new DanhSachNhanVienBai2();
		ds.add(n1);
		ds.add(n2);
		ds.add(n3);
		ds.add(n4);
		ds.add(n5);
		
		System.out.println("Min sp" + ds.spMin());
		System.out.println("Max luong" + ds.luongMax());
		
		//ds.addFromType();
		ds.show();
		
//		n1.show();
//		n2.show();
//		n3.show();
//		n4.show();

	}
}
