package java_study_0123;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Stringdownload {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.naver.com"); 	// 다운로드 받을 URL 을 생성
			HttpURLConnection con = (HttpURLConnection) url.openConnection(); // URL 연결 객체 생성
			
			// 연결 옵션 설정
			con.setConnectTimeout(30000); // 30초 동안 연결이 안되면 연결 시도 종료
			con.setUseCaches(false); 	// 캐시사용을 하지 않음

			// 데이터를 읽어올 스트림을 생성
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));

			// 많은 양의 문자열을 읽어야 하는 경우
			StringBuilder sb = new StringBuilder();
			while (true) {
				String line = br.readLine(); // 한줄읽기 
				// 읽은 데이터가 없으면 반복문 중단
				if (line == null) {
					break;
				}
				sb.append(line + "\n"); // 데이터가 있으면 sb 에 추가
			}
			
			//StringBuilder 의 데이터를 String 으로 변환
			String html = sb.toString();
			System.out.println(html);
			

		} catch (Exception e) {
			System.out.println("예외" + e.getMessage());
			e.printStackTrace();
		}
	}

}




















