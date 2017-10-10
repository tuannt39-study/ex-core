package h17jb3.ex7.Streams;
//ĐỌC VÀ GHI DỮ LIỆU NHỊ PHÂN. VÍ DỤ: DÙNG DATAOUTPUTSTREAM VÀ DATAINPUTSTREAM ĐỂ GHI VÀ ĐỌC NHỮNG KIỂU DỮ LIỆU KHÁC NHAU TRÊN FILE

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class RWData {
	public static void main(String args[]) throws IOException {
		DataOutputStream dataOut;
		DataInputStream dataIn;
		int i = 10;
		double d = 1023.56;
		boolean b = true;
		try {
			dataOut = new DataOutputStream( new FileOutputStream("/home/teo/Downloads/STUDY/JavaCore/src/h17jb3/tu6/Streams/testSource.dat"));
		} catch (IOException exc) {
			System.out.println("Cannot open file.");
			return;
		}
		try {
			System.out.println("Writing " + i);
			dataOut.writeInt(i);
			System.out.println("Writing " + d);
			dataOut.writeDouble(d);
			System.out.println("Writing " + b);
			dataOut.writeBoolean(b);
			System.out.println("Writing " + 12.2 * 7.4);
			dataOut.writeDouble(12.2 * 7.4);
		} catch (IOException exc) {
			System.out.println("Write error.");
		}
		dataOut.close();
		System.out.println();
		// Now, read them back.
		try {
			dataIn = new DataInputStream( new FileInputStream("/home/teo/Downloads/STUDY/JavaCore/src/h17jb3/tu6/Streams/testSource.dat"));
		} catch (IOException exc) {
			System.out.println("Cannot open file.");
			return;
		}
		try {
			i = dataIn.readInt();
			System.out.println("Reading " + i);
			d = dataIn.readDouble();
			System.out.println("Reading " + d);
			b = dataIn.readBoolean();
			System.out.println("Reading " + b);
			d = dataIn.readDouble();
			System.out.println("Reading " + d);
		} catch (IOException exc) {
			System.out.println("Read error.");
		}
		dataIn.close();
	}
}
