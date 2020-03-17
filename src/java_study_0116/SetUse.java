package java_study_0116;

import java.util.*;

public class SetUse {

	public static void main(String[] args) {
		//Set 인스턴스 생성 - HashShet, LinkedHashSet, TreeSet 으로 변경하면서 확인
		Set<Integer> set = new TreeSet<Integer>();
		//Set에 데이터 추가 
		set.add(400);
		set.add(200);
		set.add(300);
		set.add(100);
		
		//데이터 전부 출력
		for(Integer temp : set) {
			System.out.println(temp);
		}

	}

}
