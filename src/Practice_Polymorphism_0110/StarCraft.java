package Practice_Polymorphism_0110;

//abstract 를 붙이면 추상클래스가 되면 이 클래스의 생성자를 호출하면 에러 
public abstract class StarCraft {
	// 하위 클래스의 인스턴스가 attack을 호출 할 수 있도록 오버라이딩을 위한 메소드
	// abstract 가 붙으면 추상 메소드가 됩니다. 
	// 이 메소드는 내용이 없습니다. 
	
	// 이 메소드를 소유한 클래스나 인터페이스를 상속하거나 구현한 클래스에서는 반드시 이 메소드를
	// 재정의 해줘야 합니다. 
	public abstract void attack();

	
}
