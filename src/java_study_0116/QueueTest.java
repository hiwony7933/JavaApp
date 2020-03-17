package java_study_0116;

import java.util.*;

public class QueueTest {

	public static void main(String[] args) {
		// 우선 순위 큐 : 데이터를 크기 순서대로 접근 할 수 있도록 만든 큐
		// 내부적으로 데이터가 정렬된 것이 아니고 정렬된 순서대로 접근 할수있는이진 트리 생성
		PriorityQueue<String> pg = new PriorityQueue<>();
		pg.add("서울");
		pg.add("파주");
		pg.add("전주");
		pg.add("탄현");
		// 빠른 열거를 이용해서 데이터를 1개씩 꺼내와서 출력
		// 트리의 순회를 이용하지 않기 때문에 데이터가 정렬된 순서가 아닐수있음
		for (String temp : pg) {
			System.out.print(temp + "\t");
		}
		System.out.print("\n");
		// 데이터를 poll을 이용해서 1개씩 가져와서 출력
		// 트리의 순회를 이용하기 때문에 데이터가 정렬된 순서대로 출력
		for (int i = 0; i < 4; i = i + 1) {
			System.out.print(pg.poll() + "\t");
		}

		// 아래 구문은 쓰면 안된다.
		// 지우면서 가져올 때는 데이터의 개수나 인덱스가 변할수있으므로 주의
		// pg의 size가 변해버린다. for문 안에서 pg.poll() 이 진행되기 때문에
		// 정 쓰고 싶으면 for문 밖에서 변수를 지정해서
		// int len = pg.size()
		for (int i = 0; i < pg.size(); i = i + 1) {
			System.out.print(pg.poll() + "\t");
		}
	}

}
