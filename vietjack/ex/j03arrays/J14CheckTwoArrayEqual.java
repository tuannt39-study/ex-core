package vietjack.ex.j03arrays;

//Cách kiểm tra nếu hai Mảng (Array) có bằng hay không trong Java?
//Cách so sánh hai Mảng (Array) trong Java?

import java.util.Arrays;

public class J14CheckTwoArrayEqual {
	public static void main(String[] args) throws Exception {
		int[] ary = { 1, 2, 3, 4, 5, 6 };
		int[] ary1 = { 1, 2, 3, 4, 5, 6 };
		int[] ary2 = { 1, 2, 3, 4 };
		
		//Phương thức equals() của Array trong Java để kiểm tra hai Mảng (Array) có bằng hay không
		
		System.out.println("Is array 1 equal to array 2?? " + Arrays.equals(ary, ary1));
		System.out.println("Is array 1 equal to array 3?? " + Arrays.equals(ary, ary2));
	}
}
