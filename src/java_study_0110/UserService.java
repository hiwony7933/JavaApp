package java_study_0110;
//Service 라는 단어로 끝나는 인터페이스는 클라이언트의 요청을 처리하는 메소드를 소유한 인터페이스
public interface UserService {
	
	//고객의 요청을 처리하는 인터페이스의 메소드를 설계 할 때는 요청 하나 당 메소드 1개 연결
	//2개 이상을 연결하게 되면 순서의 개념을 이해  - 2개 이상이면 순서가 있다!! 항상 생각
	
	public void disp();

}
