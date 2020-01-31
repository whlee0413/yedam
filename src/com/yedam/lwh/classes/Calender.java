package com.yedam.lwh.classes;

public class Calender {
	public static void main(String[] args) {
		int month = 4;
		
		String[] day = {"Sun","Mon","Tue","wed","Thu","Fri","Sat"};
		
		int days = getMonthDay(month);
		int firstDay = getFirstDay(month);
		
		System.out.println( month + "월은" + getMonthDay(month) +"까지입니다");
		// 요일 출력
		for ( int i = 0; i < day.length; i++) {
			System.out.print(" "+ day[i]);
		}
		System.out.println();
		// 월의 첫쨋날의 시작위치 지정
		for(int i =0; i< firstDay-1; i++) {
			System.out.print("    ");
		}
		// 7일씩 잘라서 출력
		for ( int i = 1; i <= 30; i++) {
			System.out.printf("%4d", i);
			if(( firstDay -1 + i)%7==0)
				System.out.println();
		}
	} // end of main
	
	

	// 2020년 1,2,3,4월에 해당하는 첫쨋날의 요일
	// 일 =>1, 월=>2 .....토 =>7
	static int getFirstDay(int month) {
		if (month == 1) { // 1월달은 수요일
			return 4;

		} else if (month == 2) {
			return 7;
		} else if (month == 3) {
			return 1;
		} else if (month == 4) {
			return 4;
		} else {
			return 0;
		}
	}

	// 월 입력하면 해당 월의 날짜를 변환해주는 method.
	static int getMonthDay(int month) {
		int days = 0;
		if (month < 7 && month % 2 == 0) {
			days = 31;
		} else if (month > 8 && month % 2 == 0) {
			days = 31;
		} else if (month == 2) {
			days = 28;
		} else {
			days = 30;
		}
		return days;

	}
}
