package ch06.book.p060802;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setgas(5); // Car의 setgas 메소드 호출
		
		boolean gasState = myCar.isLeftGas(); // car의 isleftgas 메소드 호출
		if(gasState) {
			System.out.println("출발합니다");
			myCar.run(); // car의 run 메소드 호출
		}
		
		if(myCar.isLeftGas()) { //car의isleftgas메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다");
			
		}else {
			System.out.println("gas를 주입하세요"
					+ ""
					+ "");
		}
	}
}
