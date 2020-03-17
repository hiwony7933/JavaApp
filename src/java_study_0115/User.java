package java_study_0115;

public class User implements Comparable<User>{

	private int num;
	private String name;
	private int score;
	
	//접근자 메소드 : getter and setters
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "User [num=" + num + ", name=" + name + ", score=" + score + "]";
	}
	
	/* 숫자 정렬할수있는 동네임
	@Override
	public int compareTo(User o) {
		if(this.num < o.num) {
			return 1;
		}else if(this.num == o.num) {
			return 0;
		}else {
			return -1;
		}

	}
	*/
	
	@Override
	public int compareTo(User o) {
		return this.name.compareTo(o.name) * -1; //내림차순 뒤에 * -1 이거 빼면 오름차순

	}
	
}

