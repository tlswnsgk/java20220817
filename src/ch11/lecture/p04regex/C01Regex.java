package ch11.lecture.p04regex;

public class C01Regex {
	public static void main(String[] args) {
		//regular expression(regex)
		//정규표현식,정규식표현
		//문자열의 패턴을 표현하는 코드(문자열)
		
		String str1 = "a";
		
		//하나의 문자
		String pattern1 = "a";
	
		System.out.println(str1.matches(pattern1));
		
		String s2 = "b";
		String p2 = "b";
		System.out.println(s2.matches(p2));
		
		String s3 = "bb";
		String p3 = "b";
		
		System.out.println(s3.matches(s3));
		
		String s4 = "bbb";
		String p4 = "b+";// + : 한 개 이상
		
		System.out.println(s4.matches(p4));
		System.out.println(s3.matches(p4));
		System.out.println(s2.matches(p4));
		
		System.out.println("".matches(p4)); //false
		
		String p5 = "b*"; // 0개 이상
		System.out.println("bbb".matches(p5));
		System.out.println("".matches(p5)); //true
		
		String p6 =  "dog";
		System.out.println("dog".matches(p6));
		
		String p7 = "do+g";
		System.out.println("dog".matches(p7));
		System.out.println("dooooog".matches(p7));
		
		
		String p8 = "[abcd]"; // []: 안에 나열된 문자 중 하나
		System.out.println("a".matches(p8));
		System.out.println("b".matches(p8));
		System.out.println("c".matches(p8));
		System.out.println("e".matches(p8)); // false
		System.out.println("A".matches(p8)); // false
		
		String p9 = "[a-c]";
		System.out.println("a".matches(p9));
		System.out.println("b".matches(p9));
		System.out.println("c".matches(p9));
		System.out.println("d".matches(p9));
		
		
		String p10 = "[a-cA-C]"; // [abcABC]
		System.out.println("a".matches(p10));
		System.out.println("A".matches(p10));
		System.out.println("d".matches(p10));
		System.out.println("abc".matches(p10)); // false
		
		String p11 = "[^abcdefghijkl]"; // [^] 제외하고
		System.out.println("a".matches(p11)); // false
		System.out.println("m".matches(p11));
		System.out.println("0".matches(p11));
		
		String p13 = "d[^o]+g";
		
		System.out.println("dog".matches(p13)); //false
		System.out.println("dag".matches(p13));
		System.out.println("dabcedg".matches(p13));
		
		//수량
		// + : 1개 이상
		//* : 0개 이상
		// ? : 0개 또는 1개
		// {n} : n개
		// {n,} : n개 이상
		//{n,m} :n개 이상 m개 이하
		
		
		
		String p14 = "do+g";
		System.out.println("dooooog".matches(p14));
		
		String p15 = "do*g";
		System.out.println("dg".matches(p15));
		
		String p16 = "do?g";
		System.out.println("dog".matches(p16));
		System.out.println("dg".matches(p16));
		System.out.println("doog".matches(p16));//false
		
		String p17 = "do{2}g";
		System.out.println("doog".matches(p17));
		
		//기호
		// . : 모든 글자
		// \d : [0-9] (digit)
		// \w : [a-zA-z0-9] (word character
		// \s : 공백(스페이스,엔터,탭)
		// ^ : 한 줄의 시작
		// $ : 한 줄의 끝
		
		String p18 = ".";
		System.out.println("a".matches(p18));
		System.out.println(" ".matches(p18));
		System.out.println("".matches(p18)); // false
		System.out.println("aa".matches(p18)); // false
		System.out.println("aa".matches(".{2}")); 
		
		String p19 = "\\d"; // java에서 \는 \\로 작성
		
		String p20 = "\\{8}";
		System.out.println("19550101".matches(p20));
		
		String p21 = "\\d{4}-?d{2}-?\\d{2}";
		System.out.println();

		
		//() : 그룹 
		// | : or 또는
		
		String p22 = "(dog|cat)";
		
		String p23 = "(\\d{4}|\\d{2}-?\\d{2}-?\\d{2}";
		
		
		// \. : .(dot)
		String p25 = "\\.";
		System.out.println(".".matches(p25));
		
		String p26 = "www\\.[a-z]+\\.com";
		System.out.println("www.daum.com".matches(p26));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}
}
