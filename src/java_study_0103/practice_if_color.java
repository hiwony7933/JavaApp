package java_study_0103;

public class practice_if_color {
	public static void main(String[] args) {
		
		int i = 0 ;
		for(;;) {
			try {
				i  = i % 4 ;
				if(i==0)
					System.out.println("빨강");
				
				else if(i == 1)
					System.out.println("파랑");
				
				else if(i == 2)					
					System.out.println("으악");
				
				else
					System.out.println("노랑");
				
				Thread.sleep(1000);
				i ++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
