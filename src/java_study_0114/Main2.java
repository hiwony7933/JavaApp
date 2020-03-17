package java_study_0114;

public class Main2 {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 10; i=i+1) {
			System.out.println("Hello Exception");
			try {
				// sleep 메소드는 interruptedException 이 발생할 가능성이 있으므로
				// 이예외에 대한 처리를 해줘야 한다. 
				
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

}
