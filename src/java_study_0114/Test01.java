package java_study_0114;

//여러개의 속성을 묶어서 표현하기 위한 클래스는 속성의 값을 빠르게 확인하기 위해서(디버깅)
//toString 을 오버라이딩 합니다. 
public class Test01 {
	// 속성은 private으로 만들고 접근자 메소드를 public으로 선언해서 사용
	private int num;
	private String name;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Test01 other) {
		if(this.num == other.num) {	// DB에서 기본키는 중복이 안되니 내용을 비교하는 메소드가 필요하다 (num이 기본키라면)
			return true;
		}else {
			return false;
		}
	}
	
	//인스턴스의 내용을 복사해서 리턴해주는 메소드
	public Test01 clone() {
		//새로운 인스턴스를 생성
		Test01 other = new Test01();
		//기존 인스턴스의 내용을 복제
		//this 생략해도 되는데 기존 인스턴스의 내용이라는 것을 강조하기위해서 this붙임
		other.setNum(this.num);
		other.setName(this.name);
		return other;
	}
	
	@Override
	public String toString() {
		return "Test01 [num=" + num + ", name=" + name + "]";
	}

}
