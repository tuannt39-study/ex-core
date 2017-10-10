package thantrieu.tu1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B18BufferedReader {
	public static void main(String[] args) throws IOException {
		String str2;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		str2 = bf.readLine();
		System.out.println("str2 = " + str2);
	}
}
