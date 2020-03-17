package java_study_0116;

import java.util.*;

public class Player {

	public static void main(String[] args) {
		// 매개변수가 없는 생성자를 이용한 인스턴스 생성 및 필드 값 설정
		Vector vector1 = new Vector(); // 인스턴스 만들고
		vector1.setNum(1);
		vector1.setName("주원");
		vector1.setHitrate(0.342);

		// 매개변수가 있는 생성자를 이용한 인스턴스 생성 및 필드 값 설정
		Vector vector2 = new Vector(2, "해단", 0.455);
		Vector vector3 = new Vector(3, "남수", 0.235);
		Vector vector4 = new Vector(4, "기팡", 0.325);
		Vector vector5 = new Vector(5, "세희", 0.135);

		// 5개의 인스턴스를 소유한 ArrayList 인스턴스 생성
		ArrayList<Vector> list = new ArrayList<>();
		list.add(vector1);
		list.add(vector2);
		list.add(vector3);
		list.add(vector4);
		list.add(vector5);

		// Vector 클래스의 인스턴스 비교 인스턴스 : 타율의 오름차순
		Comparator<Vector> comparator = new Comparator<Vector>() {

			@Override
			public int compare(Vector o1, Vector o2) {
				if (o1.getHitrate() < o2.getHitrate()) {
					return 1;
				} else if (o1.getHitrate() == o2.getHitrate()) {
					return 0;
				} else {
					return -1;
				}

			}
			

		};
		list.sort(comparator);

		// 데이터 출력
		for (Vector vector : list) {
			System.out.println(vector);
		}

	}

}
