package com.qa.enumeration;

public class Runner {

	public static void main(String[] args) {
		Day day= Day.MONDAY;
		Day day1= Day.TUESDAY;
		Day day2= Day.WEDNESDAY;
		Day day3= Day.THURSDAY;
		Day day4= Day.FRIDAY;
		Day day5= Day.SATURDAY;
		Day day6= Day.SUNDAY;
		
		
		System.out.println(day.getFeeling());
		System.out.println(day1.getFeeling());
		System.out.println(day2.getFeeling());
		System.out.println(day3.getFeeling());
		System.out.println(day4.getFeeling());
		System.out.println(day5.getFeeling());
		System.out.println(day6.getFeeling());
		
		String star = "";
		for (int i=0; i<10; i++)
		{
			star+="*";
			System.out.println(star);
		}
		
//		switch (day) {
//		case MONDAY:
//			break;
//		case TUESDAY:
//			break;
//		case WEDNESDAY:
//			break;
//		case THURSDAY:
//			break;
//		case FRIDAY:
//			break;
//		case SATURDAY:
//			break;
//		case SUNDAY:
//			break;
			
		}

	}
	
	

//}
