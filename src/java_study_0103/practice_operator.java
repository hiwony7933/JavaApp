package java_study_0103;

public class practice_operator {
	public static void main(String[] args) {
		
		int a = 10 ;
		a++;
		System.out.println("a:" + a); //11 출력
		System.out.println("a:" + (a++)); // 11 뒤에 붙으면 먼저 출력하고 증가를 시킴
		System.out.println("a:" + (++a)); // 13 앞에 붙으면 증가를 시키고 명령을 수행 

		int a1 = 10;
		// a>5 true && a++ > 10
		boolean result = a1 > 5 && (a1++ > 10);
		System.out.println("결과" + result);
		System.out.println("a:" + a1);
		
		// a<5 false 
		// 앞의 문장이 거짓이어서 뒤의 문장을 수행하지 않기 때문에 a의 값은 증가하지 않음 
		result = a1 < 5 && (a1++ > 10);
		System.out.println("결과" + result);
		System.out.println("a:" + a1);
		

	}
}
