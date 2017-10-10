package h17jb3.tu8.NetworkPrograming;

import java.net.InetAddress;
import java.net.UnknownHostException;

//VÍ DỤ: CHƯƠNG TRÌNH LẤY THÔNG TIN ĐỊA CHỈ MÁY CHỦ

public class AddrLookupApp {
	public static void main(String[] args) {
		try {
			if (args.length != 1) {
				System.out.println("Usage: Java AddrLookupApp <HostName>");
				return;
			}
			InetAddress host = InetAddress.getByName(args[0]);
			String hostName = host.getHostName();
			System.out.println("Host name:" + hostName);
			System.out.println("IP Address:" + host.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.print("Address not found");
			return;
		}
	}
}
