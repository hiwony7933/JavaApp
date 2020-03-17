package java_study_0123;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Daummain {

	public static void main(String[] args) {

		try {
			InetAddress addr = InetAddress.getByName("www.daum.net");	// daum의 주소를 생성
			Socket socket = new Socket(addr, 80); 	//TCP 소켓 생
			
			PrintWriter pw = new PrintWriter(socket.getOutputStream()); 	// 요청 전송.
			pw.println("GET Http://www.daum.net");
			pw.flush();
			
			//데이터 읽기 - 문자 단위.
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			//읽을 데이터가 없을 때 까지 줄 단위로 읽어오기.
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				System.out.println(line);
			}
			
		}catch (Exception e) { 
			System.out.println("예외 : " + e.getMessage());
			e.printStackTrace(); 	//예외가 발생한 코드를 역추적 
		}
	}

}
