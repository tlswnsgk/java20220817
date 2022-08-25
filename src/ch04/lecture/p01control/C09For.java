package ch04.lecture.p01control;

public class C09For {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int a = 0; a <5; a++) {
			for (int b = 5; b >= 1; b--) {
				System.out.print(b);
			}
			System.out.println();
		}
		for (int c = 0; c <5; c++) {
			for (int d = 4; d >= 0; d--) {
				System.out.print(d);
			}
			System.out.println();
		}
		for (int e = 1; e <6; e++) {
			for (int f = 0; f < e; f++) {
				System.out.print(f);
			}
			System.out.println();
		}
		for (int g = 2; g < 7; g++) {
			for (int h = 1; h < g; h++) {
				System.out.print(h);
			}
			System.out.println();
		}
	}
}
