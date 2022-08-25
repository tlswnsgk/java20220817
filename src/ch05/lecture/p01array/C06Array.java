package ch05.lecture.p01array;

public class C06Array {
	public static void main(String[] args) {
		int[] arr1 = {9,8};
		int[] arr2 = {100,50};
		int[] arr3 = {99,100,10};
		
		printFirstItem(arr1);
		printFirstItem(arr2);
		printFirstItem(arr3);
		printFirstItem(new int[] {10000});
		
		printLastItem(arr1);
		printLastItem(arr2);
		printLastItem(arr3);
		printLastItem(new int[] {-1});
		
		printMiddleItem(arr1);
		printMiddleItem(arr2);
		printMiddleItem(arr3);
		printMiddleItem(new int[] {5,6,7,8,9});
		printMiddleItem(new int[] {100,200,300,400});
		
		
		
	}
	public static void printFirstItem(int[] a) {
		System.out.println(a[0]);
	}
	public static void printLastItem(int []b) {
		System.out.println(b[b.length-1]);
	}
	public static void printMiddleItem(int []c) {
		System.out.println(c[c.length/2]);
	}
}
