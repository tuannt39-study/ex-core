package h17jb3.tu8.NetworkPrograming;

//VÍ DỤ VỀ JAVA SERVER (TCP)

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {
	public static void main(String argv[]) throws Exception {
		String sentence;
		String modifiedSentence;
		//Tạo input stream
		BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
		//Tạo client socket, kết nối tới server
		Socket clientSocket = new Socket("hostname", 6789);
		//Tạo output stream, đính kèm vào socket
		DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
		//Tạo input stream, đính kèm vào trong socket
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		sentence = inFromUser.readLine();
		//Gửi dòng kí tự đến server
		outToServer.writeBytes(sentence + '\n');
		//Đọc dòng kí tự (đã biến đổi) gửi về từ server
		modifiedSentence = inFromServer.readLine();
		System.out.println("FROM SERVER: " + modifiedSentence);
		clientSocket.close();
	}
}
