package h17jb3.ex1.Basic2;
//Liet ke n so nguyen to dau tien
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class B11_1 {
    static boolean laNT(int n){
        if (n<2) {
            return false;
        } else for (int i=2; i<=sqrt(n); i++){
            if (n%i==0) {
                return false;
            }
        } return true;
    }

    static void hienThi(){
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int i=2, count=0;
        while (count<num){
            if (laNT(i)){
                System.out.print(i + " ");
                count++;
            } i++;
        }
    }

    public static void main(String[] args) {
        hienThi();
    }
}
