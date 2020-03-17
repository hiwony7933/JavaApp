package Jungol;

public class NumSquare1303 {

	public static void main(String[] args) {

		int n = 8; // 높이
		int m = 16; // 넓이
		int num = 0; // 증가값

		if (n <= 100 && m <= 100) {
			for (int i = 0; i <= n - 1; i = i + 1) {
				for (int j = 0; j <= m - 1; j = j + 1) {
					System.out.printf("%d ", num = num + 1);
				}
				System.out.println("\n");
			}
		}

	}

}
