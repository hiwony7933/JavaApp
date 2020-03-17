package java_study_0110;

public interface I_Sample {
	// final이 없어도 final : 변경 못함.
	public String TODAY = "2020-01-10";

	// abstract 가 없어도 abstract
	// 내용을 만들면 안되고 Study_interface를 implements 한곳에서는 반드시 overriding(재정의)을 해야 합니다.
	public void disp();
	
	//인터페이스에서 내용을 갖는 메소드를 만들고자 할 때는 접근지정자로 default를 사용해야 함. 
	default void print() {
		
	}

}
