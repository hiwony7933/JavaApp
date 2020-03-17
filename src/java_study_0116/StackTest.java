package java_study_0116;

import java.util.*;

public class StackTest {

	public static void main(String[] args) {
		// 문자열 저장하는 스택 생성
		Stack<String> stack = new Stack<>();
		// 데이터 저장은 push
		stack.push("해단이");
		stack.push("세희");
		stack.push("기팡이");
		stack.push("성지니");

		// 마지막 데이터 제거하면서 가져오기
		String human = stack.pop();
		System.out.println(human);
		System.out.println("---------------------------------");

		// 마지막 데이터 제거하지 않고 가져오기
		human = stack.peek();
		System.out.println(human);
		human = stack.peek();
		System.out.println(human);

		// 전체 출력
		System.out.println("---------------------------------");
		for (String temp : stack) {
			System.out.println(temp);
		}
	}

}
