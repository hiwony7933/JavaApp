package java_study_0106;

import java.util.Scanner;

public class practice_array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1~45 까지의 정수 6개를 저장할 자료구조를 생성
		int[] lotto = new int[6];

		// 6번 반복
		for (int i = 0; i < 6; i = i + 1) {
			// 정수를 입력받아서 su 에 저장
			System.out.print(i + "번째 숫자:");
			int su = sc.nextInt();
			// 1부터 45까지의 숫자만 저장하고 그 이외의 경우는 다시 입력하도록 하기
			if (su < 1 || su > 45) {
				System.out.print("1~45 사이만 입력하세요\n");
				// 이번 입력은 무효
				i = i - 1;
				// 아래로 내려가지 않고 다음 반복으로 넘어가기
				continue;
			}

			// 데이터 중복 검사
			if (i > 0) {
				boolean flag = false;
				// 첫번째 데이터부터 현재 입력할 데이터 앞까지 비교
				for (int j = 0; j < i; j = j + 1) {
					// 현재 입력받은 데이터와 같은지 비교
					if (lotto[j] == su) {
						flag = true;
						System.out.print("중복된 데이터임\n");
						// 더이상 비교할 필요가 없음
						break;
					}

				}

				// 이전 데이터와 동일한 데이터를 만나면 다시 입력받도록 작성
				if (flag == true) {
					i = i - 1;
					continue;
				}
			}

			// 입력받은 데이터를 배열에 저장

			lotto[i] = su;
		}

		// 입력받은 데이터 출력
		for (int temp : lotto) {
			System.out.print(temp + "\t");
		}

		sc.close();

	}

}
