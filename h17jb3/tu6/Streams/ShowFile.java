package h17jb3.tu6.Streams;
//ĐỌC VÀ GHI FILE DÙNG LUỒNG BYTE. Ví dụ đọc dữ liệu từ file, hiển thị nội dung của một file tên test.Txt lưu tại C:/Users/TEO/Desktop/test.txt

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
	public static void main(String args[]) throws IOException { 
		int i;
		FileInputStream fin;
		
//		File file = new File("C:/Users/TEO/Desktop/test.txt");
//		FileInputStream fin=null;
//		try { 
//			fin = new FileInputStream(file); 
//		}
		
		try { 
			fin = new FileInputStream("C:/Users/TEO/Desktop/test.txt"); 
		}
		catch(FileNotFoundException exc){
			System.out.println("File Not Found");
			return;
		}
		catch(ArrayIndexOutOfBoundsException exc){
			System.out.println("Usage: ShowFile File"); return;
		}
		// read bytes until EOF is encountered
		do {
			i = fin.read();
			if(i != -1) System.out.print((char) i);
		} while(i != -1); 
		fin.close();
	}
}
