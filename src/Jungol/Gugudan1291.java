package Jungol;

import java.util.Scanner;

public class Gugudan1291 {

	public static void main(String[] args) {
		
		// 입력값 받을 두개의 객체 생성
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		while (true) {
			System.out.print("입력값:");
			int s = sc.nextInt();
			System.out.print("입력값2:");
			int e = sc2.nextInt();
			// 두개의 값 중 큰값 작은값 선정
			
			int max = s > e ? s : e;
			int min = s < e ? s : e;
			
			// 2~9 사이의 값만 입력되게 
			if (min >= 2 && max <= 9) {
				// 1~9 단 까지
				for (int i = 1; i <= 9; i = i + 1) {
					// 입력된 값의 사이값으로 구구단 출력
					for (int j = min; j <= max; j = j + 1) {
						int aw = j * i;
						System.out.printf("%d * %d = %2d  ", j, i, aw);
					}
					System.out.print("\n");
				}
			} else {
				// 2~9 사이값 외의 값을 입력하면 다시
				System.out.println("INPUT ERROR");
				continue;
			}
			sc.close();
			sc2.close();
			break;
		}
	}
}
