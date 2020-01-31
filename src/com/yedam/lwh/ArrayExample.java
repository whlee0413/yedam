package com.yedam.lwh;

public class ArrayExample {
	public static void main(String[] args) {
		int[] intAray = { 2, 3, 4, 5 };
		System.out.println(intAray[0]);
		System.out.println(intAray[1]);
		System.out.println(intAray[2]);
		System.out.println(intAray[3]);
		System.out.println("==================");
		intAray[0] = 20;
		System.out.println("---------------");
		for (int i = 0; i < 4; i++) {
			System.out.println(intAray[i]);
		}
		System.out.println("+++++++++++");
		
	int sum = 0;
	for (int i = 0; i < 4; i++) {
		sum += intAray[i]; // sum = sum + inAray[i]
	}
	System.out.println(sum);
	}
}