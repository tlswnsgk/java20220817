package ch08.lecture.p03others;

public interface MyInterface2 {
	void method1(); // 추상메소드
	
	//default 메소드
	default void method2() {
		commonMethod();
		System.out.println("메소드2 전용 코드");
		
	}
	
	//default메소드
	default void method3() {
		commonMethod();
		System.out.println("메소드3 전용 코드");
	}
	
	//private 추가 기능
	private void commonMethod() {
		System.out.println("공통코드");
	}
}
