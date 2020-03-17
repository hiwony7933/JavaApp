package java_study_0103;

import java.util.Scanner;

public class practice_if_basic {

	public static void main(String[] args) {
		//키보드로부터 입력받기 위한 객체를 생성
		Scanner sc = new Scanner(System.in);
		//점수 입력받기
		System.out.println("점수입력:");
		int score = sc.nextInt();
		
		//점수가 60점 이상이면 합격이라고 출력
		if (score >= 60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		sc.close();
	}

}
