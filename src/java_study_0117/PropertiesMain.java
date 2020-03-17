package java_study_0117;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesMain {

	public static void main(String[] args) {
		// 프로퍼티를 저장할 수 있는 인스턴스를 생성하고 데이터를 저장
		Properties props = new Properties();

		// 프로퍼티 저장
		props.setProperty("name", "베르캄프");
		props.setProperty("nation", "hollnad");

		// 프로퍼티 나 맵 (dictionary, hashtable 이라고도 한다.)
		// 프로퍼티나 맵에 없는 key의 값을 주었을 때 동작 방식
		String name = props.getProperty("name");
		// 자바는 없는 key를 사용하면 null
		String age = props.getProperty("age");

		System.out.println("있는Key : " + name);
		System.out.println("없는Key : " + age);

		// props를 현재 디렉토리에 temp.xml 파일로 내보내기
		// 내보내기 할때는 파일 핸들링을 해야 하니까 예외처리를 해야됨
		try {
			props.storeToXML(new FileOutputStream("temp.xml"), "주석");
			// props.storeToXML(new FileOutputStream("./temp.xml"), "주석");  <-  ./를 붙여야 될때가 있다. 유닉스 환경 Max OS 등 
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage()); // 예외발생 태그 붙이는건 습관화 합시다.
		}

	}

}
