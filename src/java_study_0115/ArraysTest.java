package java_study_0115;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		// int -> Integer 와 STring은 크기 비교가 가능해서 바로 정렬 가능
		// Comparable 인터페이스가 구현되어 있는지 확인

		// 정수 배열 생성
		int[] ar = { 2, 4, 5, 6, 7, 8, 3, 1 };

		// 문자열 배열 생성
		String[] br = { "L", "T", "E", "S", "K", "R", "H", "D" };

		// ar 배열을 정렬
		Arrays.sort(ar);
		for (int temp : ar) {
			System.out.print(temp + "\t");
		}
		System.out.println("\n");

		// br 배열을 정렬
		Arrays.sort(br);
		for (String temp : br) {
			System.out.print(temp + "\t");
		}
		System.out.println("\n");

	}

}
