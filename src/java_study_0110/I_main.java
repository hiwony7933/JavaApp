package java_study_0110;

public class I_main {

	public static void main(String[] args) {
		// I_SampleImpl 클래스에 있는 disp 라는 메소드를 호출
		// I_SampleImpl sample = new I_SampleImpl();

		// 변수를 만들 때 인터페이스 이름을 사용 가능
		// 대입되는 인스턴스는 반드시 인터페이스를 implements 한 클래스의 인스턴스 이어야 한다.
		I_Sample sample = new I_SampleImpl();
		sample.disp();

		// 관습적으로 변수를 만들때는 구현된 클래스가 아닌 인터페이스 이름을 사용합니다.
		UserService service = new UserServiceImpl();
		service.disp();

	}

}
