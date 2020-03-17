package java_study_0106;
import java.util.Scanner;

public class practice_array_sum {

	public static void main(String[] args) {
		int [] ar= {40,37,51,65,29};
		
		// 합계를 구할 때 합을 저장할 변수를 규칙이 성립되기 저 또는 합을 구하기 전까지의 값으로 초기화 
		int sum = 0;
		for(int data : ar) {
			sum = sum + data;		
		}
		System.out.print("합계:" +sum + "\n");

		
		
		System.out.println("---------------");
		//피보나치 수열 (금융쪽 필수)
		// 1,1,2,3,5,8,13,21,34,55,89......
		// 피보나치 수열은 첫번째와 두번째는 무조건 1, 세번째 부터는 이전 2개 항의 합  
		// 입력받은 정수의 항까지 피보나치 수열의 합을 구하시오. (규칙은 세번째 수 부터 성립됨.)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("합을 구할 항의 번호: ");
		int su = sc.nextInt();
		if( su == 1) {
			System.out.print("합은 1\n");
		}else if( su == 2) {
			System.out.println("합은 2");
		}else {
			// 두번째 항 까지는 규칙이 적용되지 않기 때문에 미리 합계를 구해놓아야 합니다.
			sum = 2;
			// 현재 항의 첫번째 이전 데이터를 저장할 변수
			int f1 = 1;
			// 현재 항의 두번째 이전 데이터를 저장할 변수
			int f2 = 1;
			// 현재 계산될 항
			int f = 2;
			for(int i = 3; i <= su; i = i + 1) {
				sum = sum + f;
				
				// 현재 피보나치 수열의 값을 계산하는 방법
				f2 = f1;
				f1 = f;
				f = f1 + f2 ;
			}
			System.out.println("합은 : "  + sum );
		}
		
		sc.close();
		
		
		
		
		System.out.println("---------------");		
		//조건에 맞는 데이터 개수 
		int cnt = 0 ;
		for(int data:ar) {
			if(data > 50) {
				cnt = cnt + 1;
			}
		}
		System.out.print("50이 넘는 데이터 개수 :" + cnt + "\n");
		
		System.out.println("---------------");
		int cnt1 = 0 ;
		int sum1 = 0 ;
		for(int data : ar) {
			if(data > 30) {
				cnt1 = cnt1 + 1;
				sum1 = sum1 + data;
			}
		}
		
		if(cnt1 == 0 ) {
			System.out.print("조건을 만족하는 데이터없음");
		
		} else {
			double avg = (double) sum1/cnt1 ;	// 평균
			System.out.print("avg :" + avg + "\n");
			int result = (int)(avg + 0.5) ;		//반올림
			System.out.print("평균 :" + result + "\n");
		}
		
		
		
		System.out.println("---------------");		
		//  최대값, 최소값
		int max = ar[0];
		for(int data:ar) {
			if(max > data) {
				max = data;
			}
		}
		System.out.print("최소값:" + max);		
	}

}
