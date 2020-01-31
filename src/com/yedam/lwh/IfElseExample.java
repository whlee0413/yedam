package com.yedam.lwh;

public class IfElseExample {

	public static void main(String[] args) {
		int result = 92;
		
		if(result >= 95) {
			if (result >=90) {
			System.out.println("A+ 학점");
		} else {
			System.out.println("A 학점");}
	
	}  else if (result >= 80) {
			if (result >=85) {
				System.out.println("B+ 학점");
			}
		System.out.println("B 학점");
	} else if (result >70) {
		System.out.println("C 학점");
	} else {
		System.out.println("F 학점");
	}
  }
}


