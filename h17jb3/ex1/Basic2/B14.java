package h17jb3.ex1.Basic2;
/*
Viết chương trình nhập vào vào ma trận A có n dòng, m cột, các phần tử là những số nguyên lớn hơn 0 và nhỏ hơn 100 được nhập vào từ bàn phím. Thực hiện các chức năng sau:
a)	Tìm phần tử lớn nhất của ma trận cùng chỉ số của số đó.
b)	Tìm và in ra các phần tử là số nguyên tố của ma trận (các phần tử không nguyên tố thì thay bằng số 0).
c)	Sắp xếp tất cả các cột của ma trận theo thứ tự tăng dần và in kết quả ra màn hình.
*/
import java.util.Scanner;

public class B14 {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        System.out.print("Nhap m: ");
        m = sc.nextInt();
        if (n>0 && n<100 && m>0 && m<100){
            int maTrix[][] = new int[n][m];
            for (int i=0; i<n; i++){
                for (int j=0; j<m; j++){
                    System.out.print("Nhap phan tu thu " + i + "." + j + " : ");
                    maTrix[i][j] = sc.nextInt();
                }
            }
            System.out.println("Ma tran vua tao: ");
            for (int i=0; i<n; i++){
                for (int j=0; j<m; j++){
                    System.out.print(maTrix[i][j] + " ");
                }
                System.out.println();
            }
            
            //a
            int min=maTrix[0][0], max=maTrix[0][0], csiMax=0, csjMax=0, csiMin=0, csjMin=0;
            for (int i=0; i<n; i++){
                for (int j=0; j<m; j++){
                    min=maTrix[i][j]<min?maTrix[i][j]:min;
                    max=maTrix[i][j]>max?maTrix[i][j]:max;
                    if (maTrix[i][j]==max){
                    	csiMax=i;
                    	csjMax=j;
                    } else if (maTrix[i][j]==min){
                    	csiMin=i;
                    	csjMin=j;
                    }
                }
            }
            System.out.println("Phần tử có giá trị max = " + max + " là: " + csiMax + "." + csjMax);
            System.out.println("Phần tử có giá trị min = " + min + " là: " + csiMin + "." + csjMin);
            //b
            System.out.println("In ma trận chứa các số nguyên tố");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (B12.laNT(maTrix[i][j])==true) {
                        System.out.print(maTrix[i][j] + " ");
                    } else {
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
            //c
            B12 sapXepMang = new B12();
            for (int i = 0; i < n; i++) {
                sapXepMang.bubbleSort(maTrix[i], n);
            }
            System.out.println("\nMa trận đã sắp xếp");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(maTrix[j][i] + " ");
                }
                System.out.println();
            }
        }
    }
}
