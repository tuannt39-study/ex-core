package vietjack.ex.j16regularexpresstion;

import java.util.ArrayList;
import java.util.Scanner;

public class J03Dupl {
	public static void main(String[] args) {
		ArrayList<String> manyLines = new ArrayList<String>();
		ArrayList<String> noRepeat = new ArrayList<String>();
		try {
			String s1 = "Hello hello Hello there there past pastures ";
			Scanner myfis = new Scanner(s1);
			while (myfis.hasNext()) {
				String line = myfis.nextLine();
				String delim = System.getProperty("line.separator");
				String[] lines = line.split(delim);

				for (String s : lines) {
					if (!s.isEmpty() && s != null) {
						manyLines.add(s);
					}
				}
			}
			if (!manyLines.isEmpty()) {
				System.out.print("Original text is:\n");
				for (String s : manyLines) {
					System.out.println(s);
				}
			}
			if (!manyLines.isEmpty()) {
				for (String s : manyLines) {
					String result = s.replaceAll("(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+", "$1");
					noRepeat.add(result);
				}
			}
			if (!noRepeat.isEmpty()) {
				System.out.print("After Remove duplicates:\n");
				for (String s : noRepeat) {
					System.out.println(s);
				}
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
