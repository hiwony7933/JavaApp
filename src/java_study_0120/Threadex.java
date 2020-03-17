package java_study_0120;

import java.util.concurrent.Semaphore;

public class Threadex extends Thread {

	// 세마포어 변수
	private Semaphore sem;

	// 외부에서 Semaphore를 주입받습니다.
	public Threadex(Semaphore sem) {
		this.sem = sem;
	}

	public void run() {

		try {
			// lock을 취득 - 사용 개수가 1개 줄어듬
			sem.acquire();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("몬스터 생성");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}

		System.out.println("몬스터 소멸");
		// lock을 해제 - 사용 개수가 1개 늘어남
		sem.release();
	}
}
