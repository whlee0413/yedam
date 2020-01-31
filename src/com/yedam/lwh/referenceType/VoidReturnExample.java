package com.yedam.lwh.referenceType;

public class VoidReturnExample {
	public static void main(String[] args) {
		printStar(7, "+");
		
		int r = sum2(1, 2);
		System.out.println("r의 값은:" + r);
		String ret = welcome("박규림");
		System.out.println(ret);
	}

	public static String welcome(String name) {
		return "hello " + name;
	}

	public static int sum2(int a, int b) {
		int result;
		result = a + b;
		return result;
	}

	public static void printStar(int k, String str) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print(str);
			System.out.println();
		}
	}
}