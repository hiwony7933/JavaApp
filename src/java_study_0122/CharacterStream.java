package java_study_0122;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class CharacterStream {

	public static void main(String[] args) {

		try (// 파일에 문자 단위로 기록하기 위한 스트림
			PrintWriter pw = new PrintWriter("./src/Printwriter.txt");
			BufferedReader br = new BufferedReader(new FileReader("./src/Printwriter.txt"));) {
			pw.println("hello good");
			pw.println("hi wony");
			pw.flush();

			// 파일의 내용읽기 *중요함* 써먹을데가 많을거 같다.
			while (true) {
				String line = br.readLine();	// 한 줄 읽기
				if (line == null) {	// 다 읽었으면 중지
					break;
				}
				System.out.println(line);

			}

		} catch (Exception e) {
			System.out.println("예외 : " + e.getMessage());
		}

	}

}
