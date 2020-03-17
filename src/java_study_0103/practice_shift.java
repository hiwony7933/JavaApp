package java_study_0103;

public class practice_shift {

	public static void main(String[] args) {
		int n = 10;
		// 두번을 오른쪽으로 밀면 나누기 4를 한 효과 - 2가 출력됨
		System.out.println("n >> 2: " + ( n >> 2));
		// 32번 이상 밀면 모든 비트가 소멸되기 때문에 
		// 32번 이상 shift 하면 32로 나눈 나머지 만큼만 shift - 2번만 함
		System.out.println("n >> 34 : " + (n >> 34));

	}

}
