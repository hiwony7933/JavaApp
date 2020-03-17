package java_study_0107;

public class practice_BubbleSort {

	public static void main(String[] args) {
		int[] ar = { 20, 30, 40, 50, 10, 32 };

		int len = ar.length;

		// 최대 n-1 회전
		for (int i = 0; i < len - 1; i = i + 1) {
			// 1회전 동안의 데이터의 이동 여부를 판별하기 위한 변수
			boolean flag = false;
			// 자신의 인접한 데이터와 비교하기 위한 제어문
			for (int j = 0; j < len - i - 1; j = j + 1) {
				// 뒤의 데이터가 더 작으면 swap
				if (ar[j] > ar[j + 1]) {
					// 위치 이동
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
					flag = true; // 위치이동 있으면 true로 변경
				}
			}
			if (flag == false) { // 위치 이동이 없으면 탈출
				break;
			}
			for (int temp : ar) {
				System.out.print(temp + ",");
			}
			System.out.println("\n");
		}

	}

}
