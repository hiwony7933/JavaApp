package java_study_0123;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MultiReceive {

	public static void main(String[] args) {

		try {
			MulticastSocket ms = new MulticastSocket(9999);

			// 멀티캐스트 참여
			ms.joinGroup(InetAddress.getByName("230.100.100.100"));
			System.out.println("Multicast Start");
			
			while (true) {
				byte[] b = new byte[65536]; // 전송받은 데이터를 저장할 바이트 배열 - 크기는 8의 배수로 설정하는 경우가 많음.
				DatagramPacket dp = new DatagramPacket(b, b.length); // 패킷을 생성
				
				ms.receive(dp); // 데이터를 받을 수 있도록 대기
				
				String msg = new String(dp.getData()); // 데이터 읽기
				System.out.println(msg);

			}

		} catch (Exception e) {
			System.out.print("예외 : " + e.getMessage());
			e.printStackTrace();
		}
	}

}
