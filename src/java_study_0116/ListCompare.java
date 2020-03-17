package java_study_0116;

import java.util.*;

public class ListCompare {

	public static void main(String[] args) {
		// 정수 데이터를 저장하는 ArrayList 생성
		// 제너릭에서는 기본형은 사용할수 없음 - 기본형을 대체하는 Wrapper 클래스 사용
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(30);

		// 데이터 1개를 가져오기
		Integer e = al.get(1);
		System.out.println(e);

		// 데이터 1개 삭제
		al.remove(0);

		// 데이터 전체출력
		for (Integer imsi : al) {
			System.out.println(imsi);
		}

		System.out.println("-------------------------------------------------");
		// 10과 30을 갖는 ArrayList 생성
		al = new ArrayList<>();
		al.add(10);
		al.add(30);

		// 현재 시작 시간 저장
		long start = System.currentTimeMillis();

		// 20이라는 데이터를 10만번 2번째 칸 삽입
		for (int i = 0; i < 100000; i = i + 1) {
			al.add(1, 20);
		}

		// 현재 끝나는시간 저장
		long end = System.currentTimeMillis();
		System.out.println("al add : " + (end - start));

		System.out.println("-------------------------------------------------");
		
		// LinkedList //
		LinkedList<Integer> li = new LinkedList<>();
		li.add(10);
		li.add(30);

		long start1 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i = i + 1) {
			li.add(1, 20);
		}
		long end1 = System.currentTimeMillis();
		System.out.println("li add: " + (end1 - start1));

			
		System.out.println("-------------------------------------------------");
		
		long start2 = System.currentTimeMillis();
		for(int i = 0; i <al.size(); i=i+1) {
			al.get(i);
		}		
		long end2 = System.currentTimeMillis();
		System.out.println("al read: " + (end2 - start2));
		
		System.out.println("-------------------------------------------------");	
		
		start = System.currentTimeMillis();
		for(int i = 0; i <li.size(); i=i+1) {
			li.get(i);
		}		
		end = System.currentTimeMillis();
		System.out.println("li read: " + (end - start));
		
		
		
	}

}
