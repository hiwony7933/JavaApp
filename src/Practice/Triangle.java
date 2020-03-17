package Practice;

public class Triangle {

	public static void main(String[] args) {
//		****0
//		***1*2
//		**3***4
//		*5*****6
//		789012345
//		1앞에 공백이 3개, 1과 2사이에 공백 1개
//		3앞에 공백이 2개, 3과 4사이에 공백 3개
//		5앞에 공백이 1개, 5와 6사이에 공백 5개
//		아래쪽에는 숫자가 9개의 숫자를 출력
//		9다음의 숫자는 다시 0

		int line = 5;
		int su = 0;

		for (int i = 0; i < line; i = i + 1) {
			for (int j = 0; j < line - i - 1; j = j + 1) {
				System.out.print("*");
			}
			if (i == 0) {
				System.out.print(su % 10);
				su = su + 1;
			} 
			else if (i == line - 1) {
				for (int j = 0; j < 2 * line - 1; j = j + 1) {
					System.out.print(su % 10);
					su = su + 1;
				}
			} 
			else {
				System.out.print(su % 10);
				su = su + 1;
				
				for (int j = 0; j < 2 * i - 1; j = j + 1) {
					System.out.print("*");
				}

				System.out.print(su % 10);
				su = su + 1;
			}
			
			System.out.print("\n");

		}

	}

}
