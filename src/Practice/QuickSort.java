package Practice;

public class QuickSort {
	// left는 정렬의 시작위치, right는 정렬의 종료 위치, data는 정렬할 배열

	public static void quickSort(int left, int right, int[] data) {
		// 기준위치를 생성
		int pivot = left;
		// 기준 위치의 데이터보다 작은 데이터를 만났을 때 변경할 위치
		int j = pivot;
		// 데이터가 2개 이상일 때만 정렬을 수행하도록 하기 위해서
		if (left < right) {
			// pivot 위치의 데이터와 그 오른쪽에 있는 모든 데이터와 비교하기 위해서
			for (int i = pivot + 1; i <= right; i = i + 1) {
				// 피봇위치의 데이터보다 오른쪽의 데이터가 작으면
				// j 값을 1증가 시키고 j번째 데이터와 i번째 데이터를 Swap
				if (data[pivot] > data[i]) {
					j = j + 1;
					int temp = data[j];
					data[j] = data[i];
					data[i] = temp;

				}

			}
			// pivot 위치의 데이터와 j번째 데이터를 swap
			int temp = data[pivot];
			data[pivot] = data[j];
			data[j] = temp;
			// pivot 의 값을 j로 변경
			pivot = j;

			// left 부터 pivot-1 까지 다시 수행
			quickSort(left, pivot - 1, data);
			// pivot+1 부터 right까지 다시 수행
			quickSort(pivot + 1, right, data);
		}

	}

	public static void main(String[] args) {
		int[] ar = { 70, 30, 25, 40, 85, 60, 10, 70, 90, 80, 5, 3, 4, 5 };
		
		quickSort(0,ar.length-1, ar);
		
		for (int e : ar) {
			System.out.println(e);

		}
	}

}
