package vietjack.tu84.Data.Stack;

//Lớp Stack trong Java
//Lớp Stack là một lớp phụ của lớp Vector trong Java mà triển khai một last-in-first-out (LIFO) stack.
//Bạn có thể nghĩ về Stack như là một ngăn xếp thẳng đứng.
//Stack chỉ định nghĩa constructor mặc định, mà tạo một stack trống.
//Lớp Stack bao gồm tất cả phương thức được định nghĩa bởi lớp Vector, và một số phương thức khác của riêng nó.

import java.util.EmptyStackException;
import java.util.Stack;

public class J01StackDemo {
	static void showpush(Stack<Integer> st, int a) {
		st.push(new Integer(a));
		System.out.println("push(" + a + ")");
		System.out.println("stack: " + st);
	}

	static void showpop(Stack<Integer> st) {
		System.out.print("pop -> ");
		Integer a = (Integer) st.pop();
		System.out.println(a);
		System.out.println("stack: " + st);
	}

	public static void main(String args[]) {
		Stack<Integer> st = new Stack<Integer>();
		System.out.println("stack: " + st);
		showpush(st, 42);
		showpush(st, 66);
		showpush(st, 99);
		showpop(st);
		showpop(st);
		showpop(st);
		try {
			showpop(st);
		} catch (EmptyStackException e) {
			System.out.println("empty stack");
		}
	}
}
