package vietjack.tu82.Data.Bitset;

//Lớp BitSet trong Java
//Lớp BitSet trong Java tạo một kiểu mảng đặc biệt mà giữ các giá trị bit.
//Mảng BitSet này có thể tăng giảm kích cỡ nếu cần.
//Điều này làm nó tương tự như một vector của các bit.

import java.util.BitSet;

public class J01BitSetDemo {
	public static void main(String args[]) {
		BitSet bits1 = new BitSet(16);
		BitSet bits2 = new BitSet(16);

		// thiet la mot so bit
		for (int i = 0; i < 16; i++) {
			if ((i % 2) == 0)
				bits1.set(i);
			if ((i % 5) != 0)
				bits2.set(i);
		}
		System.out.println("Pattern ban dau trong bits1: ");
		System.out.println(bits1);
		System.out.println("\nPattern ban dau trong bits2: ");
		System.out.println(bits2);

		// AND bits
		bits2.and(bits1);
		System.out.println("\nbits2 AND bits1: ");
		System.out.println(bits2);

		// OR bits
		bits2.or(bits1);
		System.out.println("\nbits2 OR bits1: ");
		System.out.println(bits2);

		// XOR bits
		bits2.xor(bits1);
		System.out.println("\nbits2 XOR bits1: ");
		System.out.println(bits2);
	}
}
