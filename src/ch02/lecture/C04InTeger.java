package ch02.lecture;

public class C04InTeger {
// 정수 : byte(1), short(2), int(4), long(8)
	//1byte == 8bit(0000 0000)
	// -128 ~127 (byte 범위)
	
	byte a = 0;
	byte b = 127;
	byte c = -128;
	
	//short (2bytes)
	//-32,768~32,767
	short f = -32768;
	
	// int (4bytes)
	//-2,147,483,648~2,147,483,647
	int j = -2147483648;
	
	//long (8bytes)
	// 매우 큰 값
	long o = 3000000000L;
	
	// 정수 literal 작성시 주의 할 점
	//정수 literal은 int로 취급
	//범위를 넘어갈 떈 long타입으로 표시(대문자L표시)
	//작성하는 수가 클 떈 _와 조합 가능
	
	long q = 2_100_000_000;
	
	//연산시 overflow 주의 
	int s = 2147483647;
	
	
	int t = s + 1; // 214783648 x
		
	
	
}
