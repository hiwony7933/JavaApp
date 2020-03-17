package java_study_0114;

public class Main1 {

	public static void main(String[] args) {
		try {
			int[] ar = { 100, 300 };
			System.out.println(ar[2]); // ArrayIndexOutOfBoundsException err 발생
		}
		// Exception 클래스가 ArrayIndecOutOfBoundsException 의 상위 클래스라서
		// 예외가 발생하면 Exception 이 처리 해버림
		// 아래 catch 구문은 도달할수없는 코드가 됨.
		catch (Exception e) {
			System.err.println(e.getMessage());

//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("예외가 발생");
//			System.err.println(e.getMessage()); // out 대신에 err 사용가능

		}
	}

}


