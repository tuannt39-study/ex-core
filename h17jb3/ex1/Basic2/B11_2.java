package h17jb3.ex1.Basic2;
//Viết chương trình kiểm tra xem một số nguyên nhập vào có phải là số nguyên tố.
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class B11_2 {
    private static int laNT(int n){
        int dem=0;
        for (int i=1; i<=sqrt(n); i++){
            if (n%i==0) dem++;
        } if (dem>=2) return 0;
        else return 1;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        if (n>1){
            if (laNT(n)==0) {
                System.out.println("n khong phai la so nguyen to");
            } else System.out.println("n la so nguyen to");
        }
    }
}
