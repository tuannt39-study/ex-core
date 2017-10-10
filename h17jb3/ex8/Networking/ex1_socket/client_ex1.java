package h17jb3.ex8.Networking.ex1_socket;

//Viết chương trình client/server (echo) cho giao thức TCP:
//•	Client: nhận một dòng văn bản do người dùng nhập vào, gửi văn bản tới server, nhận một chuỗi do server gửi về và hiển thị ra màn hình

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client_ex1 {
	
	// connect to server_ex1
	protected static void chatClient() throws UnknownHostException, IOException{
		//open a socket
		Socket socket = new Socket("localhost", 9989);
		// open an inputStream
		DataInputStream inputStream = new DataInputStream(socket.getInputStream());
		// open an outphutStream
		DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
		System.out.println("Client nhan van ban do nguoi dung nhap: ");
		// get text from keyboard
		Scanner in = new Scanner(System.in);
		while(true){
			String str1 = in.nextLine();
			// send to server 
			outputStream.writeUTF(str1);
			outputStream.flush();
			if(str1.equals("bye")) break;
			//get messages from server
			String str2=inputStream.readUTF();
			System.out.println("Server said: "+str2);
		}
		// close stream
		inputStream.close();
		outputStream.close();
		// close socket
		socket.close();

	}

	public static void main(String[] args) throws UnknownHostException, IOException {
		chatClient();
	}

}
