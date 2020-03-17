package java_study_0123;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ipinfo {

	public static void main(String[] args) {

		try {
			// 자신의 컴퓨터 IP정보확인 - 자신의 컴퓨터 이름(도메인) 과 IP주
			InetAddress local = InetAddress.getLocalHost();
			System.out.println(local);
			//다음 주소의 IP 정보 확
			InetAddress [] googles = InetAddress.getAllByName("www.naver.com");
			for(InetAddress imsi : googles) {
				System.out.println(imsi);
			}
		}catch (UnknownHostException e ) {
			System.out.println("예외" + e.getMessage());
		}
	}

}
