package java_study_0106;


public class practice_minmaxproblem {

	public static void main(String[] args) {
		int [] ar = {30, 47, 51, 27, 38};
		// 위 배열에서 최대값 구하기
		int max = ar[0] ;
		for(int data : ar) {
			if(max > data) {
				max = data;
			}
		}
		System.out.println("최대값 : "+ max);	
		
		// 위 데이터 배열에서 40 과 가장 가까운 수 찾기
		// 40과의 차이가 최소인 데이터 찾기
		
		// 첫번째 데이터와 40이 차이 계산하기
		// 차이는 음수가 나올 수 없으므로 음수가 나오면 -1을 곱해서 양수로 만들기
		int chaMin = ar[0] - 40;
		if(chaMin < 0) {
			chaMin = chaMin * -1;
		}
		//차이가 가장 작은 데이터의 위치를 저장할 변수
		int idx = ar[0];
		
		//데이터 순회
		for(int data :ar) {
			int cha = data - 40;
			if(cha < 0) {
				cha = cha * -1;				
			}
			//차이가 최소인 데이터 찾기
			if(chaMin > cha) {
				//차이의 최소를 cahMin에 저장
				chaMin = cha ;
				//차이가 최소인 데이터를 idx에 저장
				idx  = data;
			}
		}
		System.out.println("40과 가까운 수: "+ idx);
		/*두 점 사이의 거리 계산
		(x1, y1), (x2, y2)
		=> (x1 - x2)제곱 + (y1-y2)제곱의 제곱근을 구하는 거리 계산방법이 있는데 유클리디안 거리
		=> (x1 = x2)절대값 + (y1 -y2)절대값의 형태로 거리 계싼하는 방법을 맨하탄 거리라고 합니다. 
		*/		
	}

}
