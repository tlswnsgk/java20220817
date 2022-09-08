package ch05.book;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		
		
		case1:
		today = Week.SUNDAY;break;
		case2:
		today = Week.MONDAY;break;
		case3:
		today = Week.TUESDAY;break;
		case4:
		today = Week.WEDNESDAY;break;
		case5:
		today = Week.THURSDAY;break;
		case6:
		today = Week.FRIDAY;break;
		case7:
		today = Week.SATURDAY;break;
										
		}
	System.out.println("오늘 요일"+today);
			
			if(today == Week.SUNDAY) {
				System.out.println("일요일에는 축구");
		
	}else {
		System.out.println("열심히 자바 공부");
	}

}

}
