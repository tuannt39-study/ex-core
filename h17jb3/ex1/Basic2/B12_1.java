package h17jb3.ex1.Basic2;

import java.util.Scanner;

public class B12_1 {
    private Integer a[];
    private  int spt;
    public void taoMang()
    {
        Scanner nhap=new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        this.spt=nhap.nextInt();

        this.a=new Integer[this.spt];

        for(int i=0;i<this.spt;i++)
        {
            System.out.print("Nhap phan tu thu " + i + ": ");
            this.a[i]=new Integer(nhap.nextInt());
        }
    }
    public void inMang()
    {
        System.out.print("Mang vua tao: ");
        for(int i=0;i<this.spt;i++)
        {
            System.out.print(" " + this.a[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        B12_1 b = new B12_1();
        b.taoMang();
        b.inMang();
    }
}
