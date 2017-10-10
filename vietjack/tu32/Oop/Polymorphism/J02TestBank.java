package vietjack.tu32.Oop.Polymorphism;

//Ví dụ này cũng có trong chương ghi đè phương thức nhưng không có Upcasting

class Bank {
	int getRateOfInterest() {
		return 0;
	}
}

class VCB extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

class AGR extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}

class CTG extends Bank {
	int getRateOfInterest() {
		return 9;
	}
}

public class J02TestBank {
	public static void main(String args[]) {
		Bank b1 = new VCB();
		Bank b2 = new AGR();
		Bank b3 = new CTG();
		System.out.println("VCB lai suat la: " + b1.getRateOfInterest());
		System.out.println("AGR lai suat la: " + b2.getRateOfInterest());
		System.out.println("CTG lai suat la: " + b3.getRateOfInterest());
	}
}