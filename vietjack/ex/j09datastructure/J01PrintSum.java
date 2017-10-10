package vietjack.ex.j09datastructure;

//Cách in tổng n số trong Java?
//Ví dụ sau minh họa cách tính tổng n số tự nhiên đầu tiên bởi sử dụng khái niệm stack trong Java.

import java.io.IOException;
import java.util.Scanner;

public class J01PrintSum {
	static int num;
	static int ans;
	static Stack theStack;

	public static void main(String[] args) throws IOException {
		
		System.out.println("Nhập n số: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		stackAddition();
		System.out.println("Sum=" + ans);
	}

	public static void stackAddition() {
		theStack = new Stack(10000);
		ans = 0;
		while (num > 0) {
			theStack.push(num);
			--num;
		}
		while (!theStack.isEmpty()) {
			int newN = theStack.pop();
			ans += newN;
		}
	}
}

class Stack {
	private int maxSize;
	private int[] data;
	private int top;

	public Stack(int s) {
		maxSize = s;
		data = new int[maxSize];
		top = -1;
	}

	public void push(int p) {
		data[++top] = p;
	}

	public int pop() {
		return data[top--];
	}

	public int peek() {
		return data[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}
}