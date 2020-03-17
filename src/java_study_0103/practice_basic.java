package java_study_0103;
      
public class practice_basic {

	public static void main(String[] args) {
		//boolean 변수를 만들어서 값을 저장
		boolean isNum = true;
		//변수의 값을 출력		
		System.out.println("isNum:" + isNum);
		//age에 저장된 값을 콘솔에 출력
		int age = 34;
		System.out.println("나이는" + age);
		
		char ch = 'A';
		int c = 'A';
		System.out.println("ch:" + ch ); 	// char를 출력하므로 A를 출력
		System.out.println("c:" + c);	// int를 출력하므로 65로 출력
		
		//자동 형 변환
		double d = 10;	//10을 10.0으로 변환해서 저장
		System.out.printf("d:%f\n", d);
		// 숫자의 표현범위가 int 보다 작은 변수에 
		// 저장 가능한 정수 리터럴을 대입하면 형 변환해서 대입됨.
		// 표현범위가 더 큰 정수는 대입이 안되고 더 큰 자료형 변수에 있는 데이터도 대입안됨.
		//short s = 3000; // 3000 이라는 상수는 short 표현 범위 내라서 대입이 가능
		// 아래 문장은 에러 
		//s = 65535; // 65535는 short 표현범위 밖이라서 대입이 불가능.
		
		//int n= 3000;
		//s = n; 
		// 같은 3000 이지만 변수에 저장된 3000은 int3000이라서 더 큰 데이터라서 에러 발생. 
	
		//자바는 산술연산( + - * / %) 을 할 때 2개의 자료형이 다르면
		//더 큰 자료형으로 변환해서 연산을 하고 int 보다 작으면 int 로 변환해서 연산
		// 2개의 자료형이 같으면 결과도 동일한 자료형으로 리턴 
		
		double result = 10 /3 ;
		//결과는 3.3이 아니고 3.0
		// 정수/정수 = 결과가 정수
		System.out.println("result:" + result);
		
		// int 보다 작은 자료형의 연산은 int로 변환해서 처리하기 때문에
		// 산술연산의 결과 최소자료형은 int
		//short s1 = 300;
		//short s2 = 100;
		// short s3 = s1 + s2 ;
		// 안됨 short + short 이지만 결과는 int 이다. 
		// 산술연산의 최소단위는 int 
		// cpu 의 정수 최소 처리 단위가 int 
		
		double r = 10 / 4 ;
		System.out.println("r:" + r ); //정수 /정수는 정수 2.0 
		
		r = (double) 10 / 4 ; 
		// 10을 실수로 변경했기 때문에 실수/정수는 실수로 결과를 리턴 
		System.out.println("r:" + r);
		
		// 실수/실수 한 결과를 정수로 저장하고자 하는 경우에는 결과를 int 변환
		int result1 = (int)(10.3 / 5.2) ;
		System.out.println("result:" + result1);
		
		double d1 = 18.75 ;
		//d를 소수 첫째 자리에서 반올림해서 정수로 변환
		int n1 = (int)(d1 + 0.5) ; 
		System.out.println("n:" + n1);
		
		//일의 자리에서 반올림
		n1 = (int)(d1 * 0.1 + 0.5) ;
		System.out.println("n:" + n1);
		// 0.1을 곱하는 이유
		// 반올림하고 싶은 자릿수를 소수 첫째 자리로 보내라(round의 원리)
		// 소수 둘째자리 까지 연습 
		
		
	}

}




























