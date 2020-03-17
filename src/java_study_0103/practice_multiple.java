package java_study_0103;

public class practice_multiple {

	public static void main(String[] args) {
		int x = 10;
		//x 가 4의 배수인지 판별
		boolean result = x % 4 == 0;
		System.out.println("result :" + result);		
		
		int year = 2020 ;
		// 윤년인지 판별
		// 윤년은 4의 배수이고 100의 배수가 아닌 경우 또는 400의 배수인경우
		
		result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		System.out.println("result :" + result);

	}

}
