package ch08.book.s080505;

public class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("버스 달림");
		
	}
	
	public static void CheckFare() {
		System.out.println("승차요금 쳌");
		
	}
}
