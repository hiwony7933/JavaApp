package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CharyMaster {

	public static void main(String[] args) {
		
		String [] image = {"!", "@" , "#", "$", "%", "^"};
		Random r = new Random();
		List<String> list = new ArrayList<String>();
		
		for(int i = 0; i<3; i=i+1) {
			String temp = (image[r.nextInt(image.length)]);
			System.out.print(temp);
			list.add(temp);
		}
		System.out.println("");
		
		if(list.get(0) == list.get(1) && list.get(1) == list.get(2)) {
			System.out.println("3개가 모두일치");
		}else if(list.get(0) == list.get(1)) {
			System.out.println("앞의 2개가 일치");
		}else {
			System.out.println("꽝");
		}

	}

}
