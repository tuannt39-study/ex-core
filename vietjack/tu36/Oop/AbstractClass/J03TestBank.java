package vietjack.tu36.Oop.AbstractClass;

//Ví dụ khác về Kế thừa lớp Abstract trong Java

public class J03TestBank {
	public static void main(String args[]) {
		// Tao mot doi tuong SBI moi

		Bank b = new SBI(); // Neu doi tuong la PNB, phuong thuc cua PNB se duoc trieu hoi

		int interest = b.getRateOfInterest(); // Trieu hoi phuong thuc cua SBI

		System.out.println("Ti le lai suat SBI la: " + interest + " %");
		
		Bank b1 = new PNB();

		int interest2 = b1.getRateOfInterest();

		System.out.println("Ti le lai suat PNB la: " + interest2 + " %");
	}
}
