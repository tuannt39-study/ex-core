package thantrieu.ex2;

import java.util.Scanner;

public class B12 {

    static long fibonaci(int n){
        long f0=1, f1=1, fn=0;
        if (n==0||n==1){
            fn=1;
        } else for (int i=2; i<=n; ++i){
            fn=f0+f1;
            f0=f1;
            f1=fn;
        }
        return fn;
    }

    static void display(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:");
        n = sc.nextInt();
        for (int i=0; i<n; ++i){
            System.out.print("\nF[" + i +"] = " + fibonaci(i));
        }
    }
    public static void main(String[] args) {
        display();
    }
}
