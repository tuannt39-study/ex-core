package h17jb3.tu6.Streams;
//ĐỌC VÀ GHI FILE DÙNG LUỒNG BYTE. • Ví dụ ghi dữ liệu xuống file, copy nội dung một file text đến một file text khác.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public static void main(String args[])throws IOException { 
		int i; 
		FileInputStream fin; 
		FileOutputStream fout;
		System.out.println("Bắt đầu ghi");
		try { 
			// open input file
			try { 
				fin = new FileInputStream("/home/teo/Downloads/STUDY/JavaCore/src/h17jb3/tu6/Streams/bai2.txt");
			}
			catch(FileNotFoundException exc) { 
				System.out.println("Input File Not Found"); 
				return; 
			}
			// open output file
			try { 
				fout = new FileOutputStream("/home/teo/Downloads/STUDY/JavaCore/src/h17jb3/tu6/Streams/bai2.dat"); 
			}
			catch(FileNotFoundException exc) { 
				System.out.println("Error Opening Output File"); 
				return; 
			}
		} catch(ArrayIndexOutOfBoundsException exc) { 
			System.out.println("Usage: CopyFile From To"); 
			return; 
		}
		
		try {// Copy File
			do { 
				i = fin.read();
				if(i != -1) fout.write(i);
			} while(i != -1);
		} catch(IOException exc) { 
			System.out.println("File Error"); 
		}
		fin.close(); fout.close();
		System.out.println("Ghi xong");
	}
}
