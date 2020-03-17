package java_study_0123;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPSend {

	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket();
			Scanner sc = new Scanner(System.in);
			while(true) {
				
				System.out.print("전송할메시지:" );	//메시지 입력  
				String msg = sc.nextLine();
				
				//전송할 패킷 생성  
				DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, InetAddress.getByName("127.0.0.1"), 7777);
				ds.send(dp);
			}
			
		}catch (Exception e) {
			System.out.println("예외 : " + e.getMessage());
			e.printStackTrace();
		}
	}

}
