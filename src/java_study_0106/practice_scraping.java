package java_study_0106;

public class practice_scraping {

	public static void main(String[] args) {
		
		int total = 1164;		// 총 데이터 개수 
		int pagesu = total / 15;	// 1개 페이지의 규칙 
		
		if(total % 15 != 0) {
			pagesu = pagesu + 1;	// 페이지 개수 만들때는 나누어 떨어지지 않으면 몫 + 1
		}
		
		for(int i =0; i < pagesu ; i = i + 1 ) {
			int p = 15 * i + 1;
			System.out.println("http://www.donga.com/news/search?p=" + p + "&query=자바");
				
		}

	}

}



