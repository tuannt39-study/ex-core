package vietjack.ex.j02strings;

//Cách đệm (buffer) các String trong Java?

public class J15StringBuffer {
	public static void main(String[] args) {
		countTo_N_Improved();
	}

	private final static int MAX_LENGTH = 30;
	private static String buffer = "";

	//Cách đệm và flush (chuyển từ vùng nhớ ra đĩa) bởi sử dụng phương thức emit() trong Java.
	
	private static void emit(String nextChunk) {
		if (buffer.length() + nextChunk.length() > MAX_LENGTH) {
			System.out.println(buffer);
			buffer = "";
		}
		buffer += nextChunk;
	}

	private static final int N = 100;

	private static void countTo_N_Improved() {
		for (int count = 2; count <= N; count = count + 2) {
			emit(" " + count);
		}
	}
}
