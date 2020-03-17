package java_study_0114;

import java.util.Scanner;

public class Test01Main {

	public static void main(String[] args) {
		// Test01 클래스의 인스턴스를 만들고 내용을 채운 후 출력
		Test01 test01 = new Test01();
		test01.setNum(1);
		test01.setName("AAA");
		// 출력 - 인스턴스 이름을 출력하는 메소드에 대입하면 toString() 을 호출한 결과가 출력됨
		System.out.println(test01);
		System.out.println("-----------------");
		////////////////////////////////////////////////////////////

		String id = "root";
		Scanner sc = new Scanner(System.in);

		System.out.print("아이디:");
		String input = sc.nextLine();
		// 참조형이라서 내용이 같더라도 false로 나올수있습니다.
		System.out.println(id == input);
		System.out.println(id.equals(input));

		sc.close();

		System.out.println("-----------------");
		//////////////////////////////////////////////

		Test01 test02 = new Test01();
		test02.setNum(1);
		test02.setName("AAA");
		// 참조를 비교 - 각각 new를 했기 때문에 참조가 다름
		System.out.println(test01 == test02);
		// 내용을 비교 - equals를 재정의해서 내용을 비교
		System.out.println(test01.equals(test02));
		
		System.out.println("-----------------");
		//////////////////////////////////////////////

		//참조를 복사 - 하나의 변경이 다른 것에도 영향을 주게 된다. 
		Test01 test03 = test01;
		test03.setNum(2);
		System.out.println(test01);
		
		//내용을 복제 - 하나의 변경이 다른것에 영향을 주지 않는다
		Test01 test04 = test01.clone();
		test04.setNum(3);
		System.out.println(test01);
	}

}
