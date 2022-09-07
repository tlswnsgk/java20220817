package ch11.book;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "012311-123132";
		char sex = ssn.charAt(7);
		
		switch (sex) {
		case '1':
		case '3':
			System.out.println("맨");
			break;
		case'2' : 
		case'4' :
			System.out.println("걸");
			break;
		}
	}
}
