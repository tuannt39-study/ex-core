package h17jb3.tu8.NetworkPrograming;

//VÍ DỤ VỀ JAVA SERVER (TCP)

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String argv[]) throws Exception {
		String clientSentence;
		String capitalizedSentence;
		@SuppressWarnings("resource")
		//Tạo sẵn Socket ở cổng 6789
		ServerSocket welcomeSocket = new ServerSocket(6789);
		while (true) {
			//Dợi đến khi có socket từ client gửi đến
			Socket connectionSocket = welcomeSocket.accept();
			//Tạo input stream, đính kèm vào socket
			BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
			//Tạo output stream, đính kèm vào socket
			DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
			//Đọc dòng kí tự trong socket
			clientSentence = inFromClient.readLine();
			capitalizedSentence = clientSentence.toUpperCase() + "\n";
			//Ghi dòng kí tự đã biến đổi vào socket
			outToClient.writeBytes(capitalizedSentence);
		} //Kết thúc vòng lặp while, quay trở về vòng lặp cha, đợi kết nối khác
	}
}