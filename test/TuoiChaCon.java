package test;

import java.util.Scanner;

public class TuoiChaCon {
	public static void main(String[] args) {
		int tuoiCha = 0;
		int tuoiCon = 0;
		int nam=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tuổi của Cha:");
		tuoiCha = sc.nextInt();
		while(tuoiCha<25) {
			System.out.println("Nhập lại tuổi của Cha:");
			tuoiCha = sc.nextInt();
		}
		
		System.out.println("Nhập tuổi của Con");
		tuoiCon = sc.nextInt();
		while(tuoiCon>=tuoiCha) {
			System.out.println("Nhập lại tuổi của Con:");
			tuoiCon = sc.nextInt();
		}
		
//		for (int nam = 1; nam < 99; nam++) {
//			tuoiCha = tuoiCha + 1;
//			tuoiCon = tuoiCon + 1;
//			if (tuoiCha == 2 * tuoiCon) {
//				System.out.println("Sau " + nam + " năm" + "\nTuổi cha = " + tuoiCha + "\nTuổi con = " +  tuoiCon);
//				break;
//			}
//		}
		
		while (tuoiCha != 2 * tuoiCon) {
			tuoiCha = tuoiCha + 1;
			tuoiCon = tuoiCon + 1;
			nam=nam+1;
			if (tuoiCha == 2 * tuoiCon) {
				System.out.println("Sau " + nam + " năm" + "\nTuổi cha = " + tuoiCha + "\nTuổi con = " +  tuoiCon);
				break;
			}
		}
	}
}
