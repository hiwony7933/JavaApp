package java_study_0120;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {

	public static void main(String[] args) {
			
		// 동시에 3개까지 실행되는 세마포어 생성
		Semaphore sem = new Semaphore(3);
		for (int i = 0; i < 20; i = i + 1) {
			Threadex th = new Threadex(sem);
			th.start();

		}
	}

}
