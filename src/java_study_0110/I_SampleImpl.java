package java_study_0110;

//I_Sample 인터페이스를 구현한 클래스 
public class I_SampleImpl implements I_Sample {

	@Override
	public void disp() {
		//인터페이스에 있는 변수를 가지고와서 출력
		System.out.println(TODAY);
		//수정은 안됨 - 인터페이스의 변수는 무조건 상수
		//TODAY = "2020-11-11";

	}

}
