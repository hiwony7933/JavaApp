package java_study_0122;

import java.io.RandomAccessFile;

public class RandomFileMain {

	public static void main(String[] args) {

		try (RandomAccessFile f = new RandomAccessFile("./random.txt", "rw");

		) {
			//기록할 내용 생성
			String msg  = "Hello Random Access File";
			//문자열을 바이트 배열로 변환해서 기록 
			f.write(msg.getBytes());
			
			//데이터읽기.
			//파일포인터를 읽을 위치로 이동.
			f.seek(0);
			//5개읽기.
			byte [] b = new byte[5];
			f.read(b);
			//바이트 배열을 문자열로 변환해서 출력.
			System.out.println(new String(b));
			
			//파일 포인터를 시작위치로 다시 옮겨서 다시 읽어냄.
			
			f.seek(0);
			//5개읽기.
			b = new byte[5];
			f.read(b);
			//바이트 배열을 문자열로 변환해서 출력.
			System.out.println(new String(b));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
