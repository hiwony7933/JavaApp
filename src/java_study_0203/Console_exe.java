package java_study_0203;

import java.util.Scanner;

public class Console_exe {

	public static void main(String[] args) {

		System.out.println("java로 exe 만들기");

		// 실행파일을 만들었을 때 콘솔화면을 유지하기 위해서 입력 받는 문장을 추가한다.
		// 아래 구문을 넣지 않으면 바로 사라짐.
		Scanner sc = new Scanner(System.in);
		System.out.println("아무키나 누르면 종료됩니다.");
		sc.nextLine();
		sc.close();
	}
}




