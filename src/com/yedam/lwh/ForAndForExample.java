package com.yedam.lwh;

public class ForAndForExample {
	public static void main(String[] args) {
//		for(int i=1; i<=9; i++) {
//			for(int j = 1; j <= 9; j++) {
//				System.out.println("i: " + i + ", j: " + j);
//			}
//		}
		
		for(int i=1; i<=9; i++) {
			for(int j = 2; j <= 9; j++) {
				
				System.out.print(j+"x"+i+ "=" + j*i + " ");
			}
			System.out.println();
		}
	}
}
