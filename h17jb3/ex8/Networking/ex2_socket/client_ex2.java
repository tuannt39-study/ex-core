package h17jb3.ex8.Networking.ex2_socket;

//•	Server làm nhiệm vụ đọc một ký tự số từ '0' đến '9'. ( Ví dụ: nhận số 0: trả về “khong", 1: trả về "một" ; ... ... 9: trả về "chín", nếu nhận ký tự khác số thì trả về "Không phải số nguyên" ).  
//•	Client sẽ nhập vào 1 ký tự, gửi qua Server, nhận kết quả trả về từ Server và thể hiện lên màn hình.

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client_ex2 {
	
	//input in a character from keyboard
	// then send to server
	protected static void chatClient() throws UnknownHostException, IOException{
		// open socket connected to 9987 server 
		Socket socket = new Socket("localhost",9987);
		// initialize input and output stream
		DataInputStream inputStream = new DataInputStream(socket.getInputStream());
		DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
		
		// get character inputed from keyboard
		Scanner in = new Scanner(System.in);
		
		while(true){
			String inTxt = in.nextLine();
			// send data to server
			outputStream.writeUTF(inTxt);
			outputStream.flush();
			
			if(inTxt.equals("end")) break;
			
			// get processed data from server
			String outTxt = inputStream.readUTF();
			System.out.println("Server said: "+outTxt);
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
