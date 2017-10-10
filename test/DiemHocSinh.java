package test;

import java.util.Scanner;

public class DiemHocSinh {
    class Diem {
        double diemToan;
        double diemHoa;
        double diemLy;
        double diemTrungBinh;

        //
        Diem(double toan, double ly, double hoa) {
            this.diemToan = toan;
            this.diemLy = ly;
            this.diemHoa = hoa;
        }

        public double diemTrungBinh() {
            return diemTrungBinh = (diemToan + diemLy + diemHoa) / 3;
        }
    }

    class HocSinh {
        Scanner in = new Scanner(System.in);
        String hoTen;
        int tuoi;
        String lop;
        Diem diem;
        int MAX = 100;// so luong hoc sinh

        HocSinh() {
        }

        HocSinh(String hoTen, int tuoi, String lop, double toan, double ly, double hoa) {
            this.hoTen = hoTen;
            this.tuoi = tuoi;
            this.lop = lop;
            Diem diem = new Diem(toan, ly, hoa);
            this.diem = diem;
        }

        // public int setMAX() {
// System.out.println(" Nhap vao so luong hoc sinh: ");
// int max = in.nextInt();
// return this.MAX = max;
// }
        public void nhapMotHocSinh(HocSinh k) {
            System.out.println(" Nhap vao HO TEN: ");
            String hoTen = in.nextLine();
            System.out.println(" Nhap vap TUOI: ");
            int tuoi = in.nextInt();
            System.out.println(" Nhap vao LOP: ");
            String lop = in.nextLine();
            System.out.println(" Nhap vao diem TOAN: ");
            double toan = in.nextDouble();
            System.out.println(" Nhap vao diem LY: ");
            double ly = in.nextDouble();
            System.out.println(" Nhap vao diem HOA: ");
            double hoa = in.nextDouble();
            k = new HocSinh(hoTen, tuoi, lop, toan, ly, hoa);
        }
    }
}
