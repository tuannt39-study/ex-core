package test.motor;

import java.util.Scanner;

public class MyMotor implements IMotor {

    public int maxe;
    public String tenxe;
    public int dungtich;
    public String loaixe;

    public  MyMotor(){}

    @Override
    public void inputInfo() {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Nhap ma xe: ");
        maxe = sc1.nextInt();
        System.out.print("Nhap ten xe: ");
        tenxe = sc2.nextLine();
        System.out.print("Nhap dung tich xe: ");
        dungtich = sc1.nextInt();
        System.out.print("Nhap loai xe: ");
        loaixe = sc2.nextLine();
    }

    @Override
    public void displayInfo() {
        System.out.print("Ma xe:" + maxe
                + "\r\nTen xe:" + tenxe
                + "\r\nDung tich xe:" + dungtich
                + "\r\nLoai xe:" + loaixe);
    }

    //Kiểm tra
    public static void main(String[] args) {
        MyMotor mt = new MyMotor();
        mt.inputInfo();
        mt.displayInfo();
    }
}
