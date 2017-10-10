package h17jb3.tu8.NetworkPrograming;

//VÍ DỤ VỀ JAVA SERVER (UDP)

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
	public static void main(String args[]) throws Exception {
		@SuppressWarnings("resource")
		//Tạo datagram socket ở cổng 9876
		DatagramSocket serverSocket = new DatagramSocket(9876);
		byte[] receiveData = new byte[1024];
		byte[] sendData = new byte[1024];
		while (true) {
			//Tạo datagram nhận
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			//Nhận datagram
			serverSocket.receive(receivePacket);
			String sentence = new String(receivePacket.getData());
			//Nhận địa chỉ IP, cổng của bên gửi
			InetAddress IPAddress = receivePacket.getAddress();
			int port = receivePacket.getPort();
			String capitalizedSentence = sentence.toUpperCase();
			sendData = capitalizedSentence.getBytes();
			//Tạo datagram để gửi tới client 
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
			//Đính datagram vào socket
			serverSocket.send(sendPacket);
		} //Kết thúc vòng lặp while, Quay trở về vòng lặp cha, đợi datagram khác đến
	}
}