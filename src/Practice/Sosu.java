package Practice;

import java.util.Scanner;

public class Sosu {

	public static void main(String[] args) {

		if (true) {
			int su = 1000;
			for (int i = 2; i <= su / 2; i = i + 1) {
			
				if (su % i == 0) {
					System.out.printf("%d 는 소수가 아님니다.\n", i);
					
				}
			}
		}
	}
}
