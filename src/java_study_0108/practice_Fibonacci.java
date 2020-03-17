package java_study_0108;

public class practice_Fibonacci {
	// 편의상 class와 main을 한개의 file 안에서 수행함.

	// 재귀를 이용하지 않고 n 번째 피보나치 수열의 값을 return하는 Method
	public static int fibo1(int n) {
		// 첫번째나 두번째는 무조건 1
		if (n == 1 || n == 2) {
			return 1;

		}
		// 세번째 부터는 이전 2개 항의 합
		else {
			int result = -1;
			// 현재 계산할 항의 이전 두번째 항의 값을 저장할 변수
			int f2 = 1;
			// 현재 계산할 항의 이전 첫번째 항의 값을 저장할 변수
			int f1 = 1;
			for (int i = 3; i <= n; i = i + 1) {
				// 이전 2개의 항의 합을 계산하고 2개의 항을 다음항으로 이동
				result = f1 + f2;
				f2 = f1;
				f1 = result;
			}
			return result;
		}
	}

	/////////////////////////////////////////////////////////////
	// 재귀를 이용해서 피보나치 수열의 값을 찾아주는 메소드
	public static int fibo2(int n) {
		if (n == 1 || n == 2) {
			return 1;

		} else {
			// fibo2 메소드 내에서 fibo2를 호출했기 때문에 재귀라고함.
			return fibo2(n - 1) + fibo2(n - 2);
		}
	}

	//////////////////////////////////////////////////////////////

	// 현재 Class 내부에 있는 Method를 호출 할때는 이름만 기재하면됨.
	public static void main(String[] args) {
		// 재귀를 이용하지 않고 결과(빠름!!)
		int r = fibo1(10);
		System.out.println("r:" + r);

		// 재귀를 이용한 결과 (겁나느려!! Stack에 쌓임)
		//int k = fibo2(10);
		//System.out.println("k:" + k);
	}

}
