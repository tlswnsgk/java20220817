package ch12.book.exercise.p2;

public class MusicRunnable implements Runnable {
	public void run() {
		for(int i = 0; i <3; i++) {
			System.out.println("음악 재생");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
