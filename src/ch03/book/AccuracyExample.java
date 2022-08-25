package ch03.book;

public class AccuracyExample {
	public static void main(String[] args) {
		int apple = 1;
		
		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number;
		
		double result = temp/10.;
		
		System.out.println("사과 한 개에서");
		System.out.println("0.7조각을 뺴면,");
		System.out.println(result+"조각이 남는다");
		
	}
}
