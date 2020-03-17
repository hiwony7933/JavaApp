package java_study_0103;

public class practice_Loop_for {

	public static void main(String[] args) {
		// 1~ 10 까지 출력 하는 구문
		for(int i = 1 ; i <= 10; i = i + 1) {
			
			//4의 배수가 되면 반복문 중단  1, 2, 3 출력하고 중단됨
			if(i % 4 == 0 ) {
				break;
			}
			
			System.out.println("i:" + i);
		}
		
		
		System.out.println("=======================");

		// 1~ 10 까지 출력 하는 구문
		for(int i = 1 ; i <= 10; i = i + 1) {
			
			//4의 배수가 되면 다음 반복으로 이동 ( ~ 할때는 빼고 하자)
			// 1,2,3,5,6,7,9,10
			if(i % 4 == 0 ) {
				continue;
			}
			
			System.out.println("i:" + i);
		}
	}

}
