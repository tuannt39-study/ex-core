package vietjack.ex.regularexpression;

import java.util.regex.Pattern;

public class StringReg {
	public static void main(String[] args) {
		
		// + từ 1 hoặc nhiều lần, ? từ 0 hoặc 1 lần, * từ 0 hoặc nhiều lần
		
//		String data = "Hom nay troi dep qua nhi";
//		String[] str = data.split(" ");
//		for (String element : str) {
//			System.out.println(element);
//		}
//		
//		String data1 = "Hom    nay   troi dep   qua nhi";
//		String[] str1 = data1.split(" ");
//		for (String element1 : str1) {
//			System.out.println(element1);
//		}
//
//		String data2 = "Hom    nay   troi dep   qua nhi";
//		String[] str2 = data2.split("\\s+"); // + một hoặc nhiều
//		for (String element2 : str2) {
//			System.out.println(element2);
//		}
//		
//		String data3 = "Hom.nay.troi.dep.qua.nhi";
//		String[] str3 = data3.split("\\.");
//		for (String element3 : str3) {
//			System.out.println(element3);
//		}
//		
//		String data4 = "Hom54354na4y.troi.de543p .qua. 54nhi";
//		String str4 = data4.replaceAll("\\D", "");
//		System.out.println(str4);
//		
//		String str5 = data4.replaceAll("\\d", "");
//		System.out.println(str5);
//		
//		String str6 = data4.replaceAll("[^0-9]", "");
//		System.out.println(str6);
//		
//		String str7 = data4.replaceAll("[^a-zA-Z]", "");
//		System.out.println(str7);
//		
//		String regex = "[0-9]";
//		boolean str8 = data4.matches(regex); //Kiểm tra tất cả ký tự có phải từ 0 đến 9 hay không?
//		System.out.println(str8);
//		
//		String data5 = "5634735543";
//		String regex1 = "[0-9]+"; // + kiểm tra nhiều số
//		boolean str9 = data5.matches(regex1); //Kiểm tra tất cả ký tự có phải từ 0 đến 9 hay không?
//		System.out.println(str9);
//		
//		String data6 = "dfjNJKFVGHJkajioJHGFfhjd";
//		String regex2 = "[a-zA-Z]+"; // + kiểm tra nhiều chữ
//		boolean str10 = data6.matches(regex2); //Kiểm tra tất cả ký tự có phải từ a đến z và A đến Z hay không?
//		System.out.println(str10);
//
//		String data7 = "aaaammmnnnamn";
//		String regex3 = "[anm]+"; // + kiểm tra nhiều chữ
//		boolean str11 = Pattern.matches(regex3, data7); //Kiểm tra tất cả ký tự có phải chứa a n m hay không?
//		System.out.println(str11);

		String data8 = "6573956389";
		String regex4 = "[789]{1}\\d{9}+"; //Số bắt đầu là 7 hoặc 8 hoặc 9, sau đó là 9 chữ số là đúng.
		boolean str12 = Pattern.matches(regex4, data8); //Kiểm tra tất cả ký tự có phải bắt đầu là 1 trong các số 7 8 9, sau đó là 9 chữ số?
		System.out.println(str12);
	}
}
