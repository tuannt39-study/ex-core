package vietjack.tu27.Oop.Overriding;

//Ví dụ thực về ghi đè phương thức trong Java
//Giả sử Bank là một đối tượng cung cấp lãi suất.
//Nhưng lãi suất lại khác nhau giữa từng ngân hàng.
//Ví dụ, các ngân hàng VCB, AGR và CTG có thể cung cấp các lãi suất lần lượt là 8%, 7% và 9%.

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

public class J03TestBank {
	public static void main(String args[]) {
		VCB s = new VCB();
		AGR i = new AGR();
		CTG a = new CTG();
		System.out.println("VCB Rate of Interest: " + s.getRateOfInterest());
		System.out.println("AGR Rate of Interest: " + i.getRateOfInterest());
		System.out.println("CTG Rate of Interest: " + a.getRateOfInterest());
	}
}
