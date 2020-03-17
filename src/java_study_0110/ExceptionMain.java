package java_study_0110;

public class ExceptionMain {

	public static void main(String[] args) {
		int[] ar = { 100, 200 };

		System.out.println("예외처리의 목적");
		try {

			System.out.println(ar[3]);
		} catch (Exception e) {
			System.out.println(e.getMessage() + "발생");
		}
		System.out.println("예외처리의 목적 하나는 예외가 발생하더라도 계속작업을 수행하기 위해서");

		System.out.println("---------------------------------------------------------------");

		try {

			System.out.println(ar[3]);
		} catch (Exception e) {
			System.out.println(e.getMessage() + "발생");
		} finally {
			System.out.println("예외처리의 목적 하나는 예외가 발생하더라도 계속작업을 수행하기 위해서");
		}
	}

}
