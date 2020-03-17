package java_study_0115;

public class StringMain {
//중요
	public static void main(String[] args) {
		String requestURI = "/member/login";
		// 위와 같은 문자열이 있을때 마지막 / 다음에 문자열 추출 - "login"
		// 위와 같은 형태는 파일 경로에서 파일이름만 추출한다던가 웹 요청 주소에서 공통되지 않은 부분 추출할때 많이 사용
		// split을 이용해서 해결, indexOf 와 substring을 이용하기도 함.

		// /로 분할 한 후 가장 마지막 데이터 출력
		String[] sp = requestURI.split("/");
		System.out.println(sp[sp.length - 1]);

		// 마지막 /의 위치를 찾아서 그 다음부터 끝까지 분할
		int idx = requestURI.lastIndexOf("/");
		System.out.println(requestURI.substring(idx + 1));

		// 현재 운영체제가 windows 인지 확인
		String os = System.getProperty("os.name");
		
		// os에 windows 라는 문자열이 포함되어 있는지 확인
		idx = os.toLowerCase().indexOf("windows");
		
		if (idx < 0) {
			System.out.println("윈도우아님");
		} else {
			System.out.println("윈도우임");
		}
		
	}

}






