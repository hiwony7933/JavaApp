package Practice_Polymorphism_0110;

public class Star_Main {

	public static void main(String[] args) {
		StarCraft star = new Zerg();
		star.attack();

		star = new Terran();
		star.attack();

		star = new Protoss();
		star.attack();
		
		//Starcraft가 추상 클래스가 아니라면 인스턴스 생성가능
		//starcraft는 상속관계를 만들기 위해서 생성한 클래스
		// 이클래스는 작업을 할 클래스는 아님.
		// 밑에 에러가 맞음
		//star = new StarCraft();
		

	}

}






