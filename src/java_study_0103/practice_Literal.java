package java_study_0103;

public class practice_Literal {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 20;
		//a와 b는 동일한 데이터를 저장했기 때문에 해시코드가 동일
		//c는 다른 데이터를 저장했기 때문에 다른 해시코드를 출력 
		System.out.println("a:" + System.identityHashCode(a));
		System.out.println("a:" + System.identityHashCode(b));
		System.out.println("a:" + System.identityHashCode(c));
		
		
	}
}


