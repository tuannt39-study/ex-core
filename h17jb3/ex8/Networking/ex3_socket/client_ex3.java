package h17jb3.ex8.Networking.ex3_socket;

//•	Server sẽ nhận các yêu cầu là một chuỗi có khuôn dạng như sau: 
//        "OP  Operant1  Operant2\n" 
//Trong đó: 
//       - OP là một ký tự chỉ phép toán muốn thực hiện: '+','-', '*', '/'
//       - Operant1, Operant2 là đối số của phép toán.  
//       - Các thành phần trên cách nhau bởi 1 ký tự trắng ' '. 
//       - Kết thúc yêu cầu bằng ký tự xuống dòng '\n'. 
 
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client_ex3 {
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
				// get input data
				System.out.println("Phep toan + or - or * or /: ");
				String op = in.nextLine();
				System.out.println("2 doi so: ");
				int num1 = in.nextInt();
				int num2 = in.nextInt();
				
				// convert to default form 
				String inTxt = op+" "+num1+" "+num2;
				// send data to server
				outputStream.writeUTF(inTxt);
				outputStream.flush();
				
				if(inTxt.equals("end")) break;
				
				// get processed data from server
				String outAns = inputStream.readUTF();
				if(!outAns.equals("-1"))
					System.out.println("Server said: "+outAns);
				else 
					System.out.println("Form Error!");
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
