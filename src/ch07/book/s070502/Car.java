package ch07.book.s070502;

public class Car {
//필드
	public int speed;
	
	//메소드
	public void speedUp() { speed += 1;}
	
	//final method
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
