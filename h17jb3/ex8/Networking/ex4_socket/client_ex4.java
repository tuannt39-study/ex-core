package h17jb3.ex8.Networking.ex4_socket;

//•	Chương trình Sever:
//-	Lắng nghe kết nối từ các client trên cổng 9000 + X (X là số thứ tự của sinh viên)
//-	Khi có client kết nối, đọc thông điệp từ client và trả lời lại cho Client. 
//-	Server có thể hỗ trợ nhiều Client đồng thời
//•	Chương trình Client:
//-	Kết nối đến Server với thông số địa chỉ được nhập vào từ bàn phím.
//-	Gửi thông điệp đến Server. Nhận phản hồi từ Server và hiển thị lên màn hình.
//•	Thông điệp gửi từ Client và cách thức xử lý tương ứng của Server như sau:
//-	“thoat”. Khi nhận được thông điệp này, server gửi trả thông điệp “tam biet” và đóng kết nối với client.
//-	“nhonhat N”. Khi nhận thông điệp này server sẽ sinh ra một mảng gồm N số nguyên ngẫu nhiên trong khoảng [1..1000]; lấy số nhỏ nhất (M) và gửi trả số đó về cho client trong thông điệp “ketqua:M”.
//-	Không phải hai dạng thông điệp trên. Server gửi trả thông điệp “sai dinh dang”.

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client_ex4 {

	// input in a character from keyboard
	// then send to server
	protected static void chatClient(int id) throws UnknownHostException, IOException {
		// open socket connected to 9000+id server
		Socket socket = new Socket("localhost", id);
		// initialize input and output stream
		DataInputStream inputStream = new DataInputStream(socket.getInputStream());
		DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

		// get character inputed from keyboard
		Scanner in = new Scanner(System.in);

		while (true) {
			String inTxt = in.nextLine();
			// send data to server
			outputStream.writeUTF(inTxt);
			outputStream.flush();

			if (inTxt.equals("tambiet"))
				break;

			// get processed data from server
			String outTxt = inputStream.readUTF();
			System.out.println("Server said: " + outTxt);
		}
		// close stream
		inputStream.close();
		outputStream.close();
		// close socket
		socket.close();
	}

	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap vao ma so sinh vien: ");
		int id = in.nextInt();
		chatClient(id);
	}
}
