package vietjack.ex.j09datastructure;

//Cách triển khai Stack trong Java ?
//Ví dụ sau minh họa cách triển khai Stack bằng việc tạo phương thức push()
//được định nghĩa bởi người dùng (user defined) để nhập các phần tử
//và phương thức pop() để thu lấy các phần tử từ Stack đó trong Java.

public class J08ImplementStack {
	private int maxSize;
	private long[] stackArray;
	private int top;

	public J08ImplementStack(int s) {
		maxSize = s;
		stackArray = new long[maxSize];
		top = -1;
	}

	public void push(long j) {
		stackArray[++top] = j;
	}

	public long pop() {
		return stackArray[top--];
	}

	public long peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}

	public static void main(String[] args) {
		J08ImplementStack theStack = new J08ImplementStack(10);
		theStack.push(10);
		theStack.push(20);
		theStack.push(30);
		theStack.push(40);
		theStack.push(50);
		while (!theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.print(value);
			System.out.print(" ");
		}
		System.out.println("");
	}
}