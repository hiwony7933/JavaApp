package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CodingTest_1 {

	public static void main(String[] args) {
		
		//boolean 변수를 만들어서 값을 저장
		boolean isNum = false ;

		//변수의 값을 출력
		System.out.println("isNum:" + isNum);

		List<String> list = new ArrayList<String>();
		
		List<String> syncList = (List<String>) Collections.synchronizedCollection(list);
	}

}
