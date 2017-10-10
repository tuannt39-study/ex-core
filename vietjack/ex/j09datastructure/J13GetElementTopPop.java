package vietjack.ex.j09datastructure;

//Cách lấy các phần tử của một LinkedList trong Java?
//Ví dụ sau minh họa cách lấy các phần tử của một LinkedList bởi sử dụng phương thức top() và pop() trong Java.

import java.util.LinkedList;

public class J13GetElementTopPop {
	private LinkedList<Object> list = new LinkedList<Object>();

	public void push(Object v) {
		list.addFirst(v);
	}

	public Object top() {
		return list.getFirst();
	}

	public Object pop() {
		return list.removeFirst();
	}

	public static void main(String[] args) {
		J13GetElementTopPop stack = new J13GetElementTopPop();
		for (int i = 30; i < 40; i++)
			stack.push(new Integer(i));
		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
