package vietjack.tu11.VariableTypes;
//Biến local trong Java

public class J01LocalVariables {

	public void tuoiCon() {
		int tuoi = 0;
		tuoi = tuoi + 10;
		System.out.println("Tuổi của con là: " + tuoi);
	}

	public static void main(String[] args) {
		J01LocalVariables test = new J01LocalVariables();
		test.tuoiCon();
	}

}
