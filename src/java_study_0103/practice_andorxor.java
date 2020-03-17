package java_study_0103;

public class practice_andorxor {

	public static void main(String[] args) {
		int a = 20; // 00000000 00000000 00000000 00010100
		int b = 13; // 00000000 00000000 00000000 00001101
		
		System.out.println("a&B = " + (a&b));
		// 2개 모두 1인 경우에만 1 
		// 결과는 00000100
		
		System.out.println("a|B = " + (a|b));
		// 2개 모두 0인 경우에만 0 나머지는 1 
		// 결과는 00011101
		
		System.out.println("a^B = " + (a^b));
		// 2개 같은 경우는 0 다른 경우는 1
		// 결과는 00011001 
		
		
	}

}



