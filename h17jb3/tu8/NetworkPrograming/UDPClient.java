package h17jb3.tu8.NetworkPrograming;

//VÍ DỤ VỀ JAVA SERVER (UDP)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
	public static void main(String args[]) throws Exception {
		//Tạo input stream
		BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
		//Tạo client socket
		DatagramSocket clientSocket = new DatagramSocket();
		//Chuyển hostname thành địa chỉ IP sử dụng DNS
		InetAddress IPAddress = InetAddress.getByName("hostname");
		byte[] sendData = new byte[1024];
		byte[] receiveData = new byte[1024];
		String sentence = inFromUser.readLine();
		sendData = sentence.getBytes();
		//Tạo datagram cùng với dữ liệu,độ dài, địa chỉ IP, cổng
		DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
		//Gửi datagram tới server
		clientSocket.send(sendPacket);
		DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
		//Đọc datagram gửi về từ server
		clientSocket.receive(receivePacket);
		String modifiedSentence = new String(receivePacket.getData());
		System.out.println("FROM SERVER:" + modifiedSentence);
		clientSocket.close();
	}
}