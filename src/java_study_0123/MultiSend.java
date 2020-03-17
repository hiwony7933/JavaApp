package java_study_0123;

import java.net.*;
import java.util.Scanner;

public class MultiSend {

	public static void main(String[] args) {

		try {
			MulticastSocket ms = new MulticastSocket(); 	//send는 포트번호가 빠짐 
			Scanner sc = new Scanner(System.in);
			System.out.print("Nick Name : ");
			String nickname = sc.nextLine();

			while (true) {
				System.out.print("Send Message(Exit's end):");
				String msg = sc.nextLine();
				// 문자열은 ==로 비교하면 참조를 비교
				// equals 로 비교해야 값을 비교
				if (msg.equals("end")) {
					System.out.println("end");
					break;
				}
				msg = nickname + ":" + msg;
				DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length,
						InetAddress.getByName("230.100,100,100"), 9999);	// 여기서 주소와 포트번호 설정해야됨.
				ms.send(dp);

			}

		} catch (Exception e) {
			System.out.println("예외" + e.getMessage());
			e.printStackTrace();
		}
	}

}
