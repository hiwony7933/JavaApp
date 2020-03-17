package java_study_0103;

public class practice_Loop_while {

	public static void main(String[] args) {
		// while은
		// 한번만 수행할 내용 -> while(조건) ->{} 내에서 반복수행할 내용
		int i = 0;
		while(i<3){
			System.out.println("Hello java");
			i = i + 1;
		}
		System.out.println("============");
		
		// do~while 은
		// 한번만 수행할 내용 -> do{반복 수행할 내용} -> while(조건);
		
		i = 0; 
		do{
			System.out.println("hello java");
			i= i + 1;
		}while(i<3);
		
		System.out.println("============");
		
		//for
		//for(한번만 수행할 내용; 조건; 두번째부터 수행할 내용){반복수행할 내용}
		for(i = 0; i < 3; i= i+1) {
			System.out.println("Hello java");
		}

	}

}
