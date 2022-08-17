package ch02.lecture;

public class C06Double {
	public static void main(String[] args) {
		//실수형 
		//float (4bytes)
		//double (8 bytes)
		//double이 float 보다 큰 범위, 더 정교한 표현 가능
		//실수 literal은 double형
		//float literal 표현은 끝에 F 붙임
		
		double a = 3.14;
		double b = 0.1981215;
		
		float c = 3.14F;
		float d = 0.14949494F;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		double f = 0.1;
		System.out.println(f);
		
		double g = 0.2;
		double h = f + g;
		System.out.println(h);
	}
	
}
