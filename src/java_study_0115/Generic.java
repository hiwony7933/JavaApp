package java_study_0115;

//Generic을 적용한 클래스
public class Generic <L>{
	
	//E 라는 미지정 자료형 배열
	private L [] data ;
	
	//생성자
	public Generic(L [] data) {
		this.data = data;
		
	}
	
	//메소드
	public void disp() {
		for(L temp : data) {
			System.out.print(temp + "\t");
		}
		System.out.println();
	}
	
}
