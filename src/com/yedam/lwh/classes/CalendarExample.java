package com.yedam.lwh.classes;

import java.util.Calendar;

public class CalendarExample {
	static void createCal(int year, int mon) {
	
	}
	
	public static void main(String[] args) {
		int year, month;
		year = 2020;
		month = 2;
		createCal(year, month);
		
		Calendar cal = Calendar.getInstance();
		System.out.println("현재년도:" + cal.get(Calendar.YEAR));
		System.out.println("현재 MONTH:" + cal.get(Calendar.MONTH));
		System.out.println("현재 DAY:" + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK));
		
		cal.set(2020,0,1);
		System.out.println("현재년도:" + cal.get(Calendar.YEAR));
		System.out.println("현재 MONTH:" + cal.get(Calendar.MONTH));
		System.out.println("현재 DAY:" + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("전체일수: " + cal.getActualMaximum(Calendar.MONTH));
	}
}
